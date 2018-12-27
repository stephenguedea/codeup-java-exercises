package LearningJava.Lessons.Lesson7OOBpart2;

public class SilverMember extends Member {
//    SilverMember member = new SilverMember("Stephen", 1, 2010);

    // CONSTRUCTOR
    public SilverMember() {
        System.out.println("Child constructor with no parameter");
    }

    // CONSTRUCTOR
    public SilverMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }


    // OVERRIDING A METHOD
    @Override
    public void calculateAnnualFee(){
        annaulFee = (1-0.01*getDiscount())*(100 +12*30);
    }

}
