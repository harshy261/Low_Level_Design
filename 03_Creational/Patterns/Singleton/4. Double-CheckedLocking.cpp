#include <mutex>
#include <iostream>
using namespace std;
class LazySingleton
{
private:
    static LazySingleton *instance;
    static std::mutex mutex;

    // Private constructor to prevent instantiation
    LazySingleton() {}

    // Non-copyable and non-movable
    LazySingleton(const LazySingleton &) = delete;
    LazySingleton &operator=(const LazySingleton &) = delete;

public:
    // Method to get the instance of the class
    static LazySingleton *getInstance()
    {
        if (instance == nullptr)
        {                                            // First check without lock for performance
            std::lock_guard<std::mutex> lock(mutex); // Lock
            if (instance == nullptr)
            { // Double check with lock
                instance = new LazySingleton();
            }
        }
        return instance;
    }
};

// Initialize static members
LazySingleton *LazySingleton::instance = nullptr;
std::mutex LazySingleton::mutex;

int main()
{
    auto instance = LazySingleton::getInstance();
    cout << instance << endl;

    instance = LazySingleton::getInstance();
    cout << instance << endl;
    return 0;
}