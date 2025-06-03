#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    if (x < 0) return false;
    int reversed = 0, original = x;
    while (x != 0) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }
    return reversed == x; // Bug: Should be 'reversed == original'
}

int main() {
    int x = 121;
    cout << boolalpha << "Is palindrome: " << isPalindrome(x) << endl;
    return 0;
}
