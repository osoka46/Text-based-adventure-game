public class River extends BattleLoc{


    public River(Player player) {
        super(player, "River");
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
