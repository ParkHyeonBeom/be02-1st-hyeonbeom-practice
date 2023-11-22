package day03;

public class Student {
    String name;
    int age;
    String gender;
    int fullness;
    int intelligence;

    int eating (String menu, int amount)
    {
        fullness=fullness+amount;
        return fullness;
    }
    int studying (String subject, int time)
    {
        intelligence=intelligence+time;
        return intelligence;
    }
}
