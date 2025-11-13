package accessModifier.abstractClass;

public abstract class BMWVehicle {
    private String name;
    private String engine;
    private static String BRAND = "BMW";
    private static String COMPANY = "BMW1";
    public static String GROUP = "BGroup";
    static String COUNTRY = "Con";

    protected void run() {
        System.out.println("run...");
    }

    protected abstract void start();

    public abstract void stop();
    abstract void fixEngine();

    public String getBrand() {
        return BRAND;
    }

    public String getCompany() {
        return COMPANY;
    }

    public String getGroup() {
        return GROUP;
    }
}
