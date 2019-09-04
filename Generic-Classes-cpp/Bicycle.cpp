// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Bicycle.cpp
// Defines class Bicycle

#include <iostream>
using namespace std;

#include "Bicycle.h"

#define DEFAULT 0

Bicycle::Bicycle() {
    CFp = DEFAULT;
}

int Bicycle::getCarbonFootprint() {
    return CFp;
}

void Bicycle::info() {
    cout << "\nBICYCLE" << endl;
}
