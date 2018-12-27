package LearningJava.Lessons.Lesson7OOBpart2;

public class GoldMember extends Member {

    public GoldMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee() {
        annaulFee = (1-0.01*getDiscount()) * 1200;
    }
}

/* THIS CLASS HAS ONE CONSTRUCTOR (WITH 3 PARAMETERS) AND ONE METHOD CALCULATEANNUALFEE
*/
