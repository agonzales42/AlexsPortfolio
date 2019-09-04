// Alexander Gonzales
// CS 271 - Object Oriented Programming
// 5/1/2019
// Lab 11
// Lab11.cpp
// Applies and tests classes inherited from virtual class CarbonFootprint

#include <iostream>
using namespace std;

#include "Bicycle.h"
#include "Car.h"
#include "Building.h"
#include "CarbonFootprint.h"

#define ASSETS 3

int cpf(CarbonFootprint* thing) {
    return thing -> getCarbonFootprint();
}

void printInfo(CarbonFootprint* thing) {
    thing -> info();
}

int main() {
    Bicycle* Lancer = new Bicycle();
    Car* Honda = new Car();
    Building* MiCasa = new Building();
    
    CarbonFootprint *myAssets[ASSETS];
    
    myAssets[0] = Lancer;
    myAssets[1] = Honda;
    myAssets[2] = MiCasa;

    for(int i = 0; i < ASSETS; i++) {
        printInfo(myAssets[i]);
        cout << "Carbon Footprint: " << cpf(myAssets[i]) << endl;
    }
    
    Honda->setGallons(12);
    MiCasa->setSQFT(1200);
    myAssets[1] = Honda;
    myAssets[2] = MiCasa;
    
    cout << "\n(after changes)" << endl;
    
    for(int i = 0; i < ASSETS; i++) {
        printInfo(myAssets[i]);
        cout << "Carbon Footprint: " << cpf(myAssets[i]) << endl;
    }
    cout << "\n\n" << endl;
}
    
    
