// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// CarbonFootprint.h
// Declares virtual class CarbonFootprint

#include <iostream>
using namespace std;

#ifndef CARBONFOOTPRINT_H
#define CARBONFOOTPRINT_H

class CarbonFootprint {
    public:
        CarbonFootprint() {
            hi = 5;}
        virtual int getCarbonFootprint() = 0;
        // added just one more virtual function to print asset's info.
        // I know there's only supposed to be one virtual function here,
        // but the virtual info function is a more elegant solution
        virtual void info() = 0;
    private:
        int hi;
};
#endif
