package com.company;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car(4, 5, 156000);
//	CarCost carCost1 = new CarCost(154000);
	Car car2 = new Car(8, 6,156000);
//	CarCost carCost2 = new CarCost(290000);

	Motorcycle motorcycle1 = new Motorcycle(2, 250);
    Motorcycle motorcycle2 = new Motorcycle(2, 190);

	 car1.printInfo();
//     carCost1.getCost();
     car2.printInfo();
//     carCost2.getCost();

     motorcycle1.printInfo();
     motorcycle2.printInfo();


    }

}
