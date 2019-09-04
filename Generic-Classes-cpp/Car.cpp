// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Car.cpp
// Defines class Car

#include <iostream>
using namespace std;

#include "Car.h"

#define MAXTANK 30   // can't imagine a car having much of a bigger tank
#define CPFMULTIPLIER 20
#define DEFAULTGAL 10

Car::Car() {
    setGallons(DEFAULTGAL);
}

Car::Car(int g) {
    setGallons(g);
}

void Car::setGallons(int g) {
    gallons = g % MAXTANK;
    CFp = gallons * CPFMULTIPLIER;
}

int Car::getGallons() {
    return gallons;
}

int Car::getCarbonFootprint() {
    return CFp;
}

void Car::info() {
    cout << "\nCAR\nGallons: " << gallons << endl;
}
