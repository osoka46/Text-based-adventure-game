public abstract class Obstacle {

    private int Id;
    private int Damage;
    private int Health;
    private int Gold;

    public Obstacle(int id, int damage, int health, int gold) {
        this.Id = id;
        this.Damage = damage;
        this.Health = health;
        this.Gold = gold;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        Gold = gold;
    }
}
