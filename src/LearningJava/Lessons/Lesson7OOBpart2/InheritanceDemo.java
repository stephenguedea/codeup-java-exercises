package LearningJava.Lessons.Lesson7OOBpart2;

public class InheritanceDemo {
    public static void main(String[] args) {
        SilverMember mem1 = new SilverMember("Cindy", 1, 2017);
        GoldMember mem2 = new GoldMember("Stephen", 2, 2018);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemberInfo();
        mem2.displayMemberInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemberInfo();

    }
}
