package Pocketmon;

public class FlyingPocketmon extends Pocketmon {
    public FlyingPocketmon(int x, int y, String name, int hp, int exp, int str, int level, int z)
    {
        super(x, y, name, hp, exp, str, level);
        this.z = z;
    }

    int z;

    int fly(int height)
    {
        z=z+height;
        return z;
    }

    int landing()
    {
        z=0;
        return z;
    }

}
