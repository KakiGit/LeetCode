#include <string>
#include <iostream>
using namespace std;

class Solution
{
  public:
    string longestPalindrome(string s)
    {
        char *mid, *left, *right;
        int length = s.length();
        for (int i = 1; i < length - 1; i++)
        {
            mid = &s.at(i);
            left = &s.at(i - 1);
            right = &s.at(i + 1);
            if (*left == *right)
                string subs = s.
        }
        return s;
    }
};