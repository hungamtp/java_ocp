package car;

import accessModifier.abstractClass.BMWVehicle;

public class BMWMiniCar extends BMWVehicle {
    @Override
    protected void start() {
        System.out.println(BMWVehicle.GROUP);
    }

    @Override
    public void stop() {

    }
}
