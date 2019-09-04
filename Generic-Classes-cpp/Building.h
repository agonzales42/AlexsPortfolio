// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Building.h
// Declares class Building, which inherits from class CarbonFootprint


#include <iostream>
using namespace std;

#include "CarbonFootprint.h"

#ifndef BUILDING_H
#define BUILDING_H

class Building : public CarbonFootprint {
    private:
        int CFp;
        int sqft;
        int findCFp();
    public:
        Building();
        Building(int);
        void setSQFT(int);
        int getSQFT();
        int getCarbonFootprint();
        void info();
};

#endif
