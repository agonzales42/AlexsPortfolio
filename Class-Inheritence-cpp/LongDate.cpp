// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 4/12/2019
// HW8
// LongDate.cpp
// LongDate member functions

#include <iostream>
#include "LongDate.h"
#include "Date.h"

using namespace std;


LongDate::LongDate(int m, int d, int y) : Date(getMonth(), getDay(), getYear()) {
    setDate(m, d, y);
    cout << "hi hi hi"<<endl;
    setDayOfTheWeek(findDayOfWeek());
}// end constructor
   
string LongDate::findDayOfWeek() {
    static string daysofweek[] =
    {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
    int d = day;
    int y = year;
    int m = month;
    y -= m < 3; 
    return daysofweek[ (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7]; 
    // https://www.geeksforgeeks.org/find-day-of-the-week-for-a-given-date/

    
}// end setDayOfTheWeek

void LongDate::setDate(int m, int d, int y) {
    setMonth(m);
    setDay(d);
    setYear(y);
    setDayOfTheWeek(findDayOfWeek());
}// end setDate

void LongDate::setDayOfTheWeek(string s) {
    dayOfTheWeek = s;
}// end setDayOfTheWeek

string LongDate::getDayOfTheWeek( ) {
    return dayOfTheWeek;
}// end function getDayOfTheWeek

void LongDate::increment( ) {
    day++;
    if(day > days[month]) {
        day -= days[month];
        month++;
        if(month > 12) {
            month -= 12;
            year++;
            if(year == 2100)
                year = 1900;
        }// end if
    }// end if
    setDayOfTheWeek(findDayOfWeek());
}// end function increment

void LongDate::print() {
    cout << getDayOfTheWeek() << " ";
    switch (getMonth()) {
        case 1: cout << "January ";   break;
        case 2: cout << "February ";  break;
        case 3: cout << "March ";     break;
        case 4: cout << "April ";     break;
        case 5: cout << "May ";       break;
        case 6: cout << "June ";      break;
        case 7: cout << "July ";      break;
        case 8: cout << "August ";    break;
        case 9: cout << "September "; break;
        case 10: cout << "October ";  break;
        case 11: cout << "November "; break;
        case 12: cout << "December ";
    }// end switch
    cout << getDay() << ", " << getYear() << endl;
}// end function print
