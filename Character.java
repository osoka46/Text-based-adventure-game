public class Character {
    private int id;
    private int health;
    private int damage;
    private int money;
    private String name;
    private static Character chars[];


    public Character() {
    }
    public Character(int id, int health, int damage, int money, String name) {
        this.id = id;
        this.health = health;
        this.damage = damage;
        this.money = money;
        this.name = name;
    }

    public static void printAllCharsInfo() {
        chars = new Character[3];
        chars[0] = new Samurai();
        chars[1] = new Archer();
        chars[2] = new Knight();

        for (Character tempChar:chars)
        {
            System.out.println("Id: "+tempChar.getId()+"\tName: "+tempChar.getName()+"\tDamage: "+tempChar.getDamage()+"\tHealth: "+tempChar.getHealth()+"\tGold: "+tempChar.getMoney());
        }
    }

    public static int charsQuantity()
    {
        int charsQuantity=chars.length;
        return charsQuantity;
    }

    public static Character getCharObjById(int id) {
        for (Character tempChar : chars) {
            if (tempChar.getId() == id) {
                return tempChar;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
