#include <iostream>
using namespace std;

int climbStairs(int n) {
    if (n <= 1) return 1;
    int a = 1, b = 1, c = 0;
    for (int i = 2; i < n; ++i) { // Bug: should be i <= n
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}

int main() {
    int n = 4;
    cout << "Ways to climb: " << climbStairs(n) << endl;
    return 0;
}
