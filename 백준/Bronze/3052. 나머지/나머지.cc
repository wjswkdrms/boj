#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int na[10];
	int result = 0;
	fill (na, na + 10,-1);
	for (int i = 0; i < 10; i++)
	{
		int input;
		cin >> input;
		input = input % 42;

		
		bool present = find(na, na + 10, input) != na + 10;
		if (!present)
		{
			na[result] = input;
			result++;
		}
	}
	cout << result;
}