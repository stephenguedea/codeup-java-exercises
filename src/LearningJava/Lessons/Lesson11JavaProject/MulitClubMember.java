package LearningJava.Lessons.Lesson11JavaProject;

public class MulitClubMember extends Member {

    private int membershipPoints;

    public MulitClubMember(){}

    public MulitClubMember(char memberType, int memberID, String name, double fees, int membershipPoints){
        super(memberType, memberID, name, fees);
        this.membershipPoints = membershipPoints;
    }

    public int getMembershipPoints() {
        return membershipPoints;
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public String toString(){
        return super.toString() + ", " + membershipPoints;
    }
}
