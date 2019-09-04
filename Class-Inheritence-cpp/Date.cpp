// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 4/12/2019
// HW8
// Date.cpp
// Date class member functions definitions

#include <iostream>
#include <string>
#include "Date.h"
using namespace std;

// initialize static member; one classwide copy
const int Date::days[] = 
   { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

// Date constructor
Date::Date( int m, int d, int y )
{ 
   setDate( m, d, y ); 
} // end Date constructor

// mutators

void Date::setDay( int dd ) {

    if (month == 2 && leapYear(year) )
       if (dd >= 1 && dd <= 29)
          day = dd;
       else
          day = 1; 
   else 
        if ( dd >= 1 && dd <= days[month] )
           day = dd;
        else
           day = 1;
}

void Date::setMonth( int mm ) {

   if (mm >= 1 && mm <= 12)
      month = mm;
   else 
      month = 1;
}

void Date::setYear( int yy ) {

    if (yy >= 1900 && yy <= 2100)
       year = yy;
    else
       year = 1900;
}

// set month, day and year
void Date::setDate( int mm, int dd, int yy )
{

   setYear( yy );
   setMonth( mm );
   setDay( dd );
   
} // end function setDate

// accessors
int Date::getDay( ) {
   return day;
}
int Date::getMonth( ) {
   return month;
}
int Date::getYear( ) {
   return year;
}

// if the year is a leap year, return true; otherwise, return false
bool Date::leapYear( int testYear )
{
   if ( testYear % 400 == 0 || 
      ( testYear % 100 != 0 && testYear % 4 == 0 ) )
      return true; // a leap year
   else
      return false; // not a leap year
} // end function leapYear

// determine whether the day is the last day of the month
bool Date::endOfMonth( int testDay ) const
{
   if ( month == 2 && leapYear( year ) )
      return testDay == 29; // last day of Feb. in leap year
   else
      return testDay == days[ month ];
} // end function endOfMonth

void Date::print( ) {
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

void Date::increment( ) {
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
}// end function increment

    

