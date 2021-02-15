package com.company;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car(4, 5, 14000);

	Car car2 = new Car(8, 6,156000);


	Motorcycle motorcycle1 = new Motorcycle(2, 250);
    Motorcycle motorcycle2 = new Motorcycle(2, 190);

	 car1.printInfo();

     car2.printInfo();


     motorcycle1.printInfo();
     motorcycle2.printInfo();


    }

}
