public abstract class Character {
    private int id;
    private int health;
    private int damage;
    private int money;
    private String name;


    public Character(int id, int health, int damage, int money, String name) {
        this.id = id;
        this.health = health;
        this.damage = damage;
        this.money = money;
        this.name = name;
    }

    public void getCharacters()
    {

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
