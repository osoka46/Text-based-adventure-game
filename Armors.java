public class Armors {

    private int id;
    private int block;
    private int money;
    private String name;


    public Armors(int id, int block, int money,String name) {
        this.id = id;
        this.block = block;
        this.money = money;
        this.name=name;
    }
    public static void printAllArmorsInfo()
    {
        Armors []armors={new Garment(),new Protector(),new Armor()};
        for (Armors tempsArmor:armors)
        {
            System.out.println("Armor: "+tempsArmor.getName()+"\tId: "+tempsArmor.getId()+"\tBlock: "+tempsArmor.getBlock()+"\tGold: "+tempsArmor.getMoney());
        }
    }

    public static Armors getArmorObjById(int id)
    {
        for (Armors tempArmor:getAllArmors())
        {
            if (tempArmor.getId()==id)
            {
                return tempArmor;
            }
        }
        return null;
    }

    public static Armors[] getAllArmors()
    {
        Armors []armors={new Armor(),new Protector(), new Garment()};

        return armors;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
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
