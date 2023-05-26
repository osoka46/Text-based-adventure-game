public class ToolHouse extends NormalLoc{
    private Weapons weapons;
    private Armors armors;


    public ToolHouse(Player player) {
        super(player, "ToolHouse");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Tool Store. You can buy armors or weapons here.");


        return true;
    }



    public void printWeapon()
    {


    }
    public void printArmor()
    {

    }
}
