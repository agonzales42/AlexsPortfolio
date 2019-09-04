// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Building.cpp
// Defines class Building

#include <iostream>
using namespace std;

#include "Building.h"

#define DEFAULTSQFT 1800

#define WOODFRAME 50
#define BASEMENT 20
#define CONCRETE 47
#define STEEL 17


Building::Building() {
    setSQFT(DEFAULTSQFT);
}

Building::Building(int s) {
    setSQFT(s);
}

void Building::setSQFT(int s) {
    sqft = s;
    CFp = findCFp();
}

int Building::findCFp() {
    return sqft * (WOODFRAME + BASEMENT + CONCRETE + STEEL);
}

int Building::getSQFT() {
    return sqft;
}

int Building::getCarbonFootprint() {
    return CFp;
}

void Building::info() {
    cout << "\nBUILDING\nSquare Footage: " << sqft << " sqft" << endl;
}
