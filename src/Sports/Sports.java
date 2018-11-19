package Sports;

public class Sports {

    protected int players;
    protected String teamNames;

    // constructor
    public Sports(int players, String teamNames){
        this.players = players;
        this.teamNames = teamNames;
    }

    //method
    public void playBall(){
        System.out.println("What game we playing?");
    }

    public void run(String action){
        System.out.println(action);
    }
}
