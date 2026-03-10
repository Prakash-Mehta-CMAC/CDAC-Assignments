#include <iostream>
using namespace std;

int main()
{
    int num = 10;     

    int *ptr = &num;   
    int &ref = num;    

    cout << "Initial value of num: " << num << endl;

    *ptr = 20;
    cout << "After modifying using pointer: " << num << endl;

    ref = 30;
    cout << "After modifying using reference: " << num << endl;

    return 0;
}