package SingletonDesignPattern;

public class Samosa {

    private Samosa(){

    }
    private static  Samosa samosa;

    public static  Samosa getSamosa() {

        if (samosa == null) {

             samosa = new Samosa();
        }

        return samosa;
    }
}
