#include <mutex>
#include <iostream>
using namespace std;
class LazySingleton
{
private:
    LazySingleton() {}
    LazySingleton(const LazySingleton &) = delete;
    LazySingleton &operator=(const LazySingleton &) = delete;

    static LazySingleton *instance;
    static std::once_flag onceFlag; // new

    static void createInstance()
    {
        instance = new LazySingleton();
    }

public:
    static LazySingleton *getInstance()
    {
        // std::call_once(onceFlag, []()
        //                { instance = new LazySingleton(); }); // new

        std::call_once(onceFlag, createInstance); // new
        return instance;
    }
};

LazySingleton *LazySingleton::instance = nullptr;
std::once_flag LazySingleton::onceFlag; // new

int main()
{
    auto instance = LazySingleton::getInstance();
    cout << instance << endl;

    instance = LazySingleton::getInstance();
    cout << instance << endl;
    return 0;
}
