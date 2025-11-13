package interfaces;

public interface GBanger {
    void talking();

    default void makingL() {
        System.out.println("Making L");
    }
}
