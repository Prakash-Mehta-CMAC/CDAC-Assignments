#include <iostream>
using namespace std;

int main()
{
 
    int *arr = new int[5];

    cout << "Enter 5 integers:\n";

    for(int i = 0; i < 5; i++)
    {
        cin >> arr[i];
    }

    cout << "You entered:\n";

    for(int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    delete[] arr;

    return 0;
}