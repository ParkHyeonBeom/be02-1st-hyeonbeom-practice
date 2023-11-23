package day04;

public class Car {

    String name;

    int location;

    public Car(String name)
    {
        this.name = name;
    }
    public Car(String name, int location)
    {
        this.name = name;
        this.location = location;
    }

    void move()
    {
        this.location = this.location+1;
        for (int i=0 ; i<this.location ; i++)
            System.out.print("-");

        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void result() {
        for (int i=0 ; i<this.location ; i++)
            System.out.print("-");
        System.out.println();
    }

    public int getLocation() {
        return location;
    }
}
