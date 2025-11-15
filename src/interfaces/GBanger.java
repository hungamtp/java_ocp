package interfaces;

public interface GBanger {
    int TIMEOUT = 30;
    void talking();

    default void makingL() {
        System.out.println("Making L");
    }
    static void gettingG(){
        System.out.println("getting G");
    }
    default void gettingL() {
        System.out.println("getting L");
    }
    default int makingR() {
        System.out.println("custom Making R");
        return 0;
    }
    // private method must be implemented in interface
    // being used as a helper method
    private void privateMethod(){

    }
    static void ems(){
        System.out.println("ems");
    }
    interface HBanger{
        void talking();
    }

}
interface BBanger{
    void talking();
}
