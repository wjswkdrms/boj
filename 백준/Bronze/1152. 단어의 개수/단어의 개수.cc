#include <iostream>
#include <string>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	string s;
	int i = 0;
	while (!(cin >> s).eof())
		i++;
	cout << i;
}