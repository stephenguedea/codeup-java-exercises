package AbstractYoutube;

public abstract class Wrestlers {
    public static void paymentForWork(int hours) {

        System.out.println("The Wrestler will make $" + hours*250.00 + " for tonight's match");
    }


    //abstract methods
    public abstract void wrestlerName();

    public abstract void themeMusic();

    public abstract void finisher();
}
