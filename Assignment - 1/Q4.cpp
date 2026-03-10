#include <iostream>
#include <string>
using namespace std;

class Employee
{
private:
    int empID;
    string empName;
    double empSalary;

public:

    void setEmpID(int id)
    {
        empID = id;
    }

    void setEmpName(string name)
    {
        empName = name;
    }

    void setEmpSalary(double salary)
    {
        empSalary = salary;
    }

    int getEmpID()
    {
        return empID;
    }

    string getEmpName()
    {
        return empName;
    }

    double getEmpSalary()
    {
        return empSalary;
    }

    double calculateGrossSalary()
    {
        double gross;

        if (empSalary <= 5000)
            gross = empSalary + (empSalary * 0.10);
        else if (empSalary <= 10000)
            gross = empSalary + (empSalary * 0.15);
        else
            gross = empSalary + (empSalary * 0.20);

        return gross;
    }

    void displayEmployeeDetails()
    {
        cout << "\nEmployee Details\n";
        cout << "Employee ID: " << empID << endl;
        cout << "Employee Name: " << empName << endl;
        cout << "Salary: " << empSalary << endl;
        cout << "Gross Salary: " << calculateGrossSalary() << endl;
    }
};

int main()
{
    Employee emp[10];   
    int count = 0;
    int choice;

    do
    {
        cout << "\n------ Employee Payroll Menu ------\n";
        cout << "1. Add New Employee\n";
        cout << "2. Calculate Gross Salary\n";
        cout << "3. Display Employee Details\n";
        cout << "4. Update Employee Information\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        int id;
        string name;
        double salary;
        int i;

        switch (choice)
        {
        case 1:
            if (count < 10)
            {
                cout << "Enter Employee ID: ";
                cin >> id;

                bool exists = false;
                for (i = 0; i < count; i++)
                {
                    if (emp[i].getEmpID() == id)
                    {
                        exists = true;
                        break;
                    }
                }

                if (exists)
                {
                    cout << "Employee ID already exists.\n";
                }
                else
                {
                    cout << "Enter Employee Name: ";
                    cin >> name;

                    cout << "Enter Salary: ";
                    cin >> salary;

                    emp[count].setEmpID(id);
                    emp[count].setEmpName(name);
                    emp[count].setEmpSalary(salary);

                    count++;
                    cout << "Employee added successfully.\n";
                }
            }
            else
            {
                cout << "Employee limit reached.\n";
            }
            break;

        case 2:
            cout << "Enter Employee ID: ";
            cin >> id;

            for (i = 0; i < count; i++)
            {
                if (emp[i].getEmpID() == id)
                {
                    cout << "Gross Salary: " << emp[i].calculateGrossSalary() << endl;
                    break;
                }
            }

            if (i == count)
                cout << "Employee not found.\n";

            break;

        case 3:
            cout << "Enter Employee ID: ";
            cin >> id;

            for (i = 0; i < count; i++)
            {
                if (emp[i].getEmpID() == id)
                {
                    emp[i].displayEmployeeDetails();
                    break;
                }
            }

            if (i == count)
                cout << "Employee not found.\n";

            break;

        case 4:
            cout << "Enter Employee ID to update: ";
            cin >> id;

            for (i = 0; i < count; i++)
            {
                if (emp[i].getEmpID() == id)
                {
                    cout << "Enter new name: ";
                    cin >> name;

                    cout << "Enter new salary: ";
                    cin >> salary;

                    emp[i].setEmpName(name);
                    emp[i].setEmpSalary(salary);

                    cout << "Employee updated.\n";
                    break;
                }
            }

            if (i == count)
                cout << "Employee not found.\n";

            break;

        case 5:
            cout << "Exiting program...\n";
            break;

        default:
            cout << "Invalid choice\n";
        }

    } while (choice != 5);

    return 0;
}