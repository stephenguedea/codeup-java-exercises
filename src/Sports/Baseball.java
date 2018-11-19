package Sports;

public class Baseball extends Sports {

    // This is the same thing as a constructor for the main class
    public Baseball(int players, String teamNames) {
        super(players, teamNames);

    }
    public void playBall(){
        System.out.println("Go Red Sox!");
    }
}
