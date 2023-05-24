public class Player {
    private int health;
    private int damage;
    private int money;
    private String charName;
    private String name;
    private String message="You have selected ";


    public Player(String name)
    {
        this.name=name;
    }


    public void getAllCharsInfo()
    {
        Character.printAllCharsInfo();
    }

    public void initPlayer(int charId)
    {
        System.out.println(this.message+Character.getCharObjById(charId).getName());
       this.setDamage(Character.getCharObjById(charId).getDamage());
       this.setHealth(Character.getCharObjById(charId).getHealth());
       this.setMoney(Character.getCharObjById(charId).getMoney());
    }
    public void printCurrentInfo() {
        System.out.println("Weapon: " +
                "\tArmor: "+
                "\tBlock: "+
                "\tDamage: " + this.getDamage() +
                "\tHealth: " + this.getHealth()
                + "\tGold: " + this.getMoney());
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
