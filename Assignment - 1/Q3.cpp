#include <iostream>
using namespace std;

class TollBooth
{
private:
    int totalVehicles;
    double totalRevenue;

public:

    TollBooth()
    {
        totalVehicles = 0;
        totalRevenue = 0;
    }

    void reset()
    {
        totalVehicles = 0;
        totalRevenue = 0;
        cout << "Booth statistics reset.\n";
    }

    void vehiclePayingToll(int vehicleType, double tollAmount)
    {
        totalVehicles = totalVehicles + 1;
        totalRevenue = totalRevenue + tollAmount;
    }

    int getTotalVehicles()
    {
        return totalVehicles;
    }

    double getTotalRevenue()
    {
        return totalRevenue;
    }
};

int main()
{
    TollBooth booth;
    int choice;

    double carToll = 180;
    double truckToll = 300;
    double busToll = 350;

    do
    {
        cout << "\n------ Toll Booth Menu ------\n";
        cout << "1. Add a standard car and collect toll\n";
        cout << "2. Add a truck and collect toll\n";
        cout << "3. Add a bus and collect toll\n";
        cout << "4. Display total vehicles passed\n";
        cout << "5. Display total revenue collected\n";
        cout << "6. Reset booth statistics\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            booth.vehiclePayingToll(1, carToll);
            cout << "Car processed. Toll collected: Rs." << carToll << endl;
            break;

        case 2:
            booth.vehiclePayingToll(2, truckToll);
            cout << "Truck processed. Toll collected: Rs." << truckToll << endl;
            break;

        case 3:
            booth.vehiclePayingToll(3, busToll);
            cout << "Bus processed. Toll collected: Rs." << busToll << endl;
            break;

        case 4:
            cout << "Total vehicles passed: " << booth.getTotalVehicles() << endl;
            break;

        case 5:
            cout << "Total revenue collected: Rs." << booth.getTotalRevenue() << endl;
            break;

        case 6:
            booth.reset();
            break;

        case 7:
            cout << "Exiting program...\n";
            break;

        default:
            cout << "Invalid choice\n";
        }

    } while (choice != 7);

    return 0;
}