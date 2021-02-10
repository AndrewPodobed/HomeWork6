package com.company;

public class Car extends Vehicle implements Costable {
    private int doorsCount;
    private int costCar;

    public Car(int wheelCount, int doorsCount, int costCar) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.costCar = costCar;

    }


    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.print("Транспортное средство: Машина - Количество дверей: " +
                 doorsCount + " - Количество колес: " + wheelCount + " Стоимость автомобиля:" + getCost() + " долларов США" );

    }
    @Override
    public int getCost(){
        return costCar;
    }


}
