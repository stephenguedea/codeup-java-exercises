package Sports;

public class SportsTest {

    public static void main(String[] args) {

        // new objects instances
        Baseball b = new Baseball(9, "Red Sox");
        // create variable b that's a type of Baseball and it's a Baseball object
        Football f = new Football(11, "Cowboys");
        Soccer s = new Soccer(10, "LA Galaxy");
        Basketball bk = new Basketball(5, "San Antonio Spurs");


        // An Array of Sports Objects
        Sports[] sports = {b, f, s, bk}; // creating an array of Sports objects

        //iterate over the array of strings
        for(Sports sport : sports){
            System.out.println("Number of players: " + sport.players);
            System.out.println("Baseball Team: " + sport.teamNames);

            sport.playBall();
            System.out.println();

        }
        f.run();


        // Create a new "Variable" that is typeof "Sport", but within that
        // variable is an object that is typeof football

//        Football newTeam = new Football(10, "Longhorns");
//        newTeam.run("Run the down!");

        // CASTING
        Sports newTeam = new Football(10, "Longhorns");
        Football Longhorns = (Football) newTeam;
        Longhorns.run("Run the ball!");
    }
}
