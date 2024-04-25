#include <mutex>
#include <iostream>
using namespace std;

class Singleton
{
private:
    Singleton() {}
    Singleton(const Singleton &) = delete;
    Singleton operator=(const Singleton &) = delete;

    static Singleton *instance;

public:
    static Singleton *getInstance()
    {
        if (instance == nullptr)
        {
            instance = new Singleton();
        }
        return instance;
    }
};

// static member init
Singleton *Singleton::instance = nullptr;

int main()
{
    Singleton *s = Singleton::getInstance();
    cout << s << endl;

    s = Singleton::getInstance();
    cout << s << endl;
    return 0;
}