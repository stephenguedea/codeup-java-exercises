package LearningJava.Lessons.Lesson11JavaProject;

// Class for SingleClubMember

public class SingleClubMember extends Member {

    private int club;

    // Constructor
    public SingleClubMember() {
    }

    // Constructor
    public SingleClubMember(char memberType, int memberID, String name, double fees, int club){
        super(memberType, memberID, name, fees);
        this.club = club;
    }

    // Getter / Setter
    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + club;
    }
}
