#include <iostream>


using namespace std;

// compilar g++ day01.cpp -o day01.exe
int calcYear(int year){

    int days = year*365;
    return days;

}


int main(int argc, char const *argv[])
{
    int year;
    cout << "Qual o ano" << endl;
    cin >> year;
    cout << calcYear(year) << endl;
    return 0;
}

