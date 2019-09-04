// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 4/12/2019
// HW8
// Lab8.cpp
// Test class functions of LongDate and Date

#include "Date.h"
#include "LongDate.h"
#include <iostream>
using namespace std;

int main() {
    Date Birthdate (3, 8, 1932);
    cout << "\n\nDate Birthdate (3, 8, 1932);" << endl;
    Birthdate.print();
    cout << "\nBirthdate.increment();" << endl;
    Birthdate.increment();
    Birthdate.print();
    cout << "\nBirthdate.setMonth(19); Birthdate.setDay(32); Birthdate.setYear(3000);" << endl;
    Birthdate.setMonth(19);
    Birthdate.setDay(32);
    Birthdate.setYear(3000);
    Birthdate.print();
    cout << "\nBirthdate.setDate(12,30,1933);" << endl;
    Birthdate.setDate(12,31,1999);
    Birthdate.print();
    cout << "\nBirthdate.increment()" <<endl;
    Birthdate.increment();
    Birthdate.print();
    
    LongDate Deathdate (9, 6, 2007);
    cout << "\n\nLongDate Deathdate(9, 6, 2007);" << endl;
    Deathdate.print();
    cout << "\nDeathdate.increment();" << endl;
    Deathdate.increment();
    Deathdate.print();
    cout << "\nDeathdate.setDate(2,29,2004);" << endl;
    Deathdate.setDate(2,29,2004);
    Deathdate.print();
    cout << "\nDeathdate.increment();" << endl;
    Deathdate.increment();
    Deathdate.print();
    
}// end main
