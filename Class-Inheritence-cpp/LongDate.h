// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 4/12/2019
// HW8
// LongDate.h
// LongDate class definitions

#ifndef LONGDATE_H
#define LONGDATE_H
#include <iostream>
#include "Date.h"
using namespace std;

class LongDate : public Date {
    public:
        LongDate(int, int,int);
        void setDayOfTheWeek(string);
        string getDayOfTheWeek( );
        string findDayOfWeek();
        void setDate(int, int, int);
        void increment();
        void print();
    private:
        string dayOfTheWeek;
};// end class LongDate

#endif
