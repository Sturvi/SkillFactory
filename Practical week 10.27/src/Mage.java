public class Mage {
    public String name;
    public int level;
    public int damage;
    public String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }


    public String getInfo() {
        return this.name + ", " + this.level + ", " + this.damage + ", " + this.type;
    }

    public String fight(Mage mage) {
        Mage mage2 = new Mage(mage.name, mage.level, mage.damage, mage.type);
        int x = typeFight(mage2.type);
        switch (x) {
            case (1):
                return name;
            case (2):
                return mage2.name;
            case (0):
                x = levelFight(mage2.level);
                switch (x) {
                    case (1):
                        return name;
                    case (2):
                        return mage2.name;
                    case (0):
                        x = damageFire(mage2.damage);
                        switch (x) {
                            case (1):
                                return name;
                            case (2):
                                return mage2.name;
                            case (0):
                                return "draw";
                        }
                }
        }
        return "Xren";
    }

    private int damageFire(int damage2) {
        if (damage > damage2) return 1;
        else if (damage < damage2) {
            return 2;
        }
        return 0;
    }

    private int levelFight(int level2) {
        if (level > level2) return 1;
        else if (level < level2) {
            return 2;

        }
        return 0;
    }

    public int typeFight(String type2) {
        switch (type) {
            case ("ice"):
                if (type2.equals("earth"))
                    return 1;
                else if (type2.equals("fire")) {
                    return 2;
                } else return 0;
            case ("fire"):
                if (type2.equals("ice"))
                    return 1;
                else if (type2.equals("earth")) {
                    return 2;
                } else return 0;
            case ("earth"):
                if (type2.equals("fire"))
                    return 1;
                else if (type2.equals("ice")) {
                    return 2;
                } else return 0;
        }
        return 4;
    }
}
