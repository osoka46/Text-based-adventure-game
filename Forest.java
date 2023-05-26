public class Forest extends BattleLoc{


    public Forest(Player player) {
        super(player, "Forest");
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
