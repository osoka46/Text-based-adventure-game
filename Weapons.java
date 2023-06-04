public abstract class Weapons {

    private int id;
    private int damage;
    private int money;
    private String name;

    public Weapons(int id, int damage, int money,String name) {
        this.id = id;
        this.damage = damage;
        this.money = money;
        this.name=name;
    }


    public static void printAllWeaponsInfo()
    {
        Weapons []weapons={new Pistol(),new Sword(),new Rifle()};
        for (Weapons tempWeapons:weapons)
        {
            System.out.println("Weapon: "+tempWeapons.getName()+"\tId: "+tempWeapons.getId()+"\tDamage: "+tempWeapons.getDamage()+"\tGold: "+tempWeapons.getMoney());
        }
    }

    public Weapons getWeaponObjById(int id)
    {
        for (Weapons tempWeapons:getAllWeapons())
        {
            if (tempWeapons.getId()==id)
            {
                return tempWeapons;
            }
        }
        return null;
    }

    public Weapons[] getAllWeapons()
    {
        Weapons []weapons={new Pistol(),new Sword(),new Rifle()};

       return weapons;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
