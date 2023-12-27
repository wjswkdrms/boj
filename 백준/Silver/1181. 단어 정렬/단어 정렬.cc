#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main()
{
    int n;
    cin >> n;
    string* word = new string[n+1];
    string mem = "\n";
    for (int i = 0; i < n; i++)
        cin >> word[i];
    sort(word, word + n);
    stable_sort(word, word + n,[](string a,string b){ return a.size() < b.size(); });
    
    for (int i = 0; i < n; i++)
    {
        if(word[i] != mem)
            cout << word[i] << '\n';
        mem = word[i];
    }
}