public class SafeHouse extends NormalLoc{


    public SafeHouse(Player player) {
        super(player, "SafeHouse");
    }

    @Override
    public boolean onLocation() {
        this.getPlayer().setHealth(this.getPlayer().getOriginHealth());
        System.out.println("Your health recharged.");
        return true;
    }
}
