#include <iostream>
#include <thread>

int counter = 0;

void func() {
    int tmp;
    tmp = counter;
    tmp++;
    counter = tmp;
}

int main() {
    std::thread t1(func);
    std::thread t2(func);
    t1.join();
    t2.join();
    std::cout << counter;

    return 0;
}
