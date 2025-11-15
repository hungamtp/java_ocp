package interfaces;

public class An implements GBanger{
    @Override
    public void talking() {
        System.out.println("sta");
    }

    @Override
    public void makingL() {
        System.out.println("Making L");
    }

    public static void main(String[] args) {
        An an = new An();
        an.gettingL();
    }
}
