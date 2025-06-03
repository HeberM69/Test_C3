#include <iostream>
#include <vector>
#include <string>
using namespace std;

vector<string> fizzBuzz(int n) {
    vector<string> result;
    for (int i = 1; i <= n; ++i) {
        if (i % 3 == 0) result.push_back("Fizz");
        else if (i % 5 == 0) result.push_back("Buzz");
        else if (i % 15 == 0) result.push_back("FizzBuzz"); // Bug: This never triggers
        else result.push_back(to_string(i));
    }
    return result;
}

int main() {
    int n = 15;
    auto res = fizzBuzz(n);
    for (const string& s : res) cout << s << endl;
    return 0;
}
