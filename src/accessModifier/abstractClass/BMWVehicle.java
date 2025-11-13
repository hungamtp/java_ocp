package accessModifier.abstractClass;

public abstract class BMWVehicle {
    // only accessed by public function ex: getter(), setter()
    private String name;
    private String engine;
    private static String BRAND = "BMW";
    private static String COMPANY = "BMW1";
    public static String GROUP = "BGroup";
    public static int ACCESS_COUNT = 0;
    private static int PRIVATE_ACCESS_COUNT = 0;
    public BMWVehicle() {
        ACCESS_COUNT++;
    }
    static String COUNTRY = "Con";

    protected void run() {
        System.out.println("run...");
    }

    protected abstract void start();

    public abstract void stop();


    public String getBrand() {
        return BRAND;
    }

    public String getCompany() {
        return COMPANY;
    }

    public String getGroup() {
        return GROUP;
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
    private String demo() {
        return "null";
    }

    public void countAccessCount(){
        PRIVATE_ACCESS_COUNT++;
    }
}
