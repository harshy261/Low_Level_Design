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
    static mutex m;

public:
    static Singleton *getInstance()
    {
        lock_guard<mutex> lock(m); // this makes current scope as ciritical section
        if (instance == nullptr)
        {
            instance = new Singleton();
        }
        return instance;
    }
};

// static member init
Singleton *Singleton::instance = nullptr;
mutex Singleton::m;

int main()
{
    Singleton *s = Singleton::getInstance();
    cout << s << endl;

    s = Singleton::getInstance();
    cout << s << endl;
    return 0;
}