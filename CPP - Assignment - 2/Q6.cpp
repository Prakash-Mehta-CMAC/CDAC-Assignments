#include <iostream>
#include <string>
using namespace std;

class Employee
{
private:
    const int employeeId;
    string name;
    float salary;

public:

    Employee(int id, string n, float s) : employeeId(id), name(n), salary(s)
    {
    }

    void displayDetails()
    {
        cout << "Employee ID: " << employeeId << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
    }
};

int main()
{
    Employee e1(101, "Rahul", 45000);

    e1.displayDetails();

    return 0;
}