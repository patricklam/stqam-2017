#include <iostream>
#include <thread>
#include <mutex>

int counter = 0;
std::mutex m;

void func() {
    int tmp;

    m.lock();
    tmp = counter;
    m.unlock();
    tmp++;
    m.lock();
    counter = tmp;
    m.unlock();
}
