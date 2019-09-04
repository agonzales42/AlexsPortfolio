// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Car.h
// Declares class Car, which inherits from class CarbonFootprint

#include <iostream>
using namespace std;

#include "CarbonFootprint.h"

#ifndef CAR_H
#define CAR_H

class Car : public CarbonFootprint {
    private:
        int CFp;
        int gallons;
        int findCFp();
    public:
        Car();
        Car(int);
        void setGallons(int);
        int getGallons();
        int getCarbonFootprint();
        void info();
};

#endif
