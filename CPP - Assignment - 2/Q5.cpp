#include <iostream>
#include <string>
using namespace std;

class Student
{
private:
    int rollNo;
    string name;
    float marks;

public:

    Student()
    {
        rollNo = 0;
        name = "Not Assigned";
        marks = 0;
    }

    Student(int r, string n, float m)
    {
        rollNo = r;
        name = n;
        marks = m;
    }

    Student(int rollNo, string name, float marks, int x)
    {
        this->rollNo = rollNo;
        this->name = name;
        this->marks = marks;
    }

    void printDetails()
    {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
        cout << "---------------------" << endl;
    }
};

int main()
{
    
    Student s1;

    Student s2(101, "Rahul", 85);
    Student s3(102, "Anita", 90, 1);

    cout << "Student 1 Details:" << endl;
    s1.printDetails();

    cout << "Student 2 Details:" << endl;
    s2.printDetails();

    cout << "Student 3 Details:" << endl;
    s3.printDetails();

    return 0;
}