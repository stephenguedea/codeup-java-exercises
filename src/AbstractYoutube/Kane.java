package AbstractYoutube;

public class Kane implements Wrestler {

    public void wrestlerName(){
        System.out.println("Kane");
    }

    public void themeMusic() {
//        TODO Auto-generated method stub
        System.out.println("Kane's Intro Music");
    }


    public void finisher(){
//        TODO Auto-generated method stub
        System.out.println("Choke slam");
    }

    public void paymentForWork(int hours){
        System.out.println("Kane's pay for tonight's match: \n$" + hours*270.00);
    }
}
