public abstract class Armors {

    private int id;
    private int block;
    private int money;


    public Armors(int id, int block, int money) {
        this.id = id;
        this.block = block;
        this.money = money;
    }


    public int getId() {
        return id;
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
}
