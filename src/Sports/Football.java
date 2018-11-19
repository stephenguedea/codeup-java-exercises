package Sports;

public class Football extends Sports {

    public Football(int players, String teamNames){
        super(players, teamNames);
    }

    public void playBall(){
        System.out.println("How bout them Cowboys");
    }

    public void run(){
        System.out.println("He could go all the way!");
    }
}
