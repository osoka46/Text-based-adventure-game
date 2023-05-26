public class Cave extends BattleLoc{


    public Cave(Player player) {
        super(player, "Cave");
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
