package Pocketmon;
public class Pocketmon {
    public Pocketmon(int x, int y, String name, int hp, int exp, int str, int level)
    {
        this.x = x;
        this.y = y;
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.str = str;
        this.level = level;
    }
    int x;
    int y;
    String name;
    int hp;
    int exp;
    int str;
    int level;

    int levelUp()
    {
        level = level + 1;
        return level;
    }

    int getExp(String enemy)
    {
        if (enemy == "포켓몬")
        {
            exp = exp + 100;
            if(exp>=100)
                levelUp();
            exp=exp%100;
        }
        else if (enemy == "배틀")
        {
            exp = exp + 150;
            if(exp>=100)
                levelUp();
            exp=exp%100;
        }
        return exp;
    }

    void attack(Pocketmon target)
    {
        target.attacked(this.str);
    }

    int attacked(int str)
    {
        this.hp = this.hp - str;
        return hp;
    }
}
