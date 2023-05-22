public class Player {
    private int health;
    private int damage;
    private int money;
    private String charName;
    private String name;


    public Player(String name)
    {
        this.name=name;
    }


    public void getCharInfo()
    {
        Character.printCharsInfo();
    }

    public void initPlayer()
    {

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
