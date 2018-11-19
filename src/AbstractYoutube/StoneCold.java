package AbstractYoutube;

public class StoneCold implements Wrestler {
    public void wrestlerName(){
        System.out.println("Stone Cold Steve Austin");
    }

    public void themeMusic(){
        System.out.println("Stone Cold's Intro Music");
    }

    public void finisher(){
        System.out.println("Stone Cold Stunner");
    }

    public void paymentForWork(int hours){
        System.out.println("Stone Cold pay for tonight's match: $" + hours*300.00);
    }
}
