package accessModifier.vehicle;

import accessModifier.abstractClass.BMWVehicle;

public class BMWCar extends BMWVehicle {
    @Override
    protected void start() {
        System.out.println(this.getBrand());
        System.out.println(BMWVehicle.GROUP);

        System.out.println("Car start");
    }

    @Override
    public void stop() {
        System.out.println("stops");
    }
}
