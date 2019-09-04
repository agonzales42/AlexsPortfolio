// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Bicycle.h
// Declares class Bicycle, which inherits from class CarbonFootprint


#include <iostream>
using namespace std;

#include "CarbonFootprint.h"

#ifndef BICYCLE_H
#define BICYCLE_H

class Bicycle : public CarbonFootprint {
    private:
        int CFp;
    public:
        Bicycle();
        int getCarbonFootprint();
        void info();
};

#endif
