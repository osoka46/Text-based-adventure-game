import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ToolHouse extends NormalLoc {
    private Weapons weapons;
    private Armors armors;
    private Scanner input;
    private final int RIGHT = 3;


    public ToolHouse(Player player) {
        super(player, "ToolHouse");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Tool Store. You can buy armors or weapons here.");
        System.out.println("Welcome to Tool Store. Type an id.\n1. Weapons\t2.Armors\t3. Exit");
        input = new Scanner(System.in);

        String tempSelect;
        int tempRight = RIGHT;
        int selectedId = 0;
        boolean showMenu=true;


        while (tempRight >= 0&&showMenu) {
            tempSelect = input.nextLine();
            try {
                selectedId = Integer.parseInt(tempSelect);
                if (selectedId < 0 && selectedId > 3) {
                    out.println("type a valid number noob.");
                    tempRight--;
                }
            } catch (Exception e) {
                tempRight--;
                if (tempRight == 0) {
                    out.println("you fucking idiot. Go and learn how to type.");
                    System.exit(0);
                } else {
                    out.println("type a valid number noob.");
                }
            }

            switch (selectedId) {
                case 1: {
                    printWeapon();
                    buyWeapon();
                    break;
                }
                case 2: {
                    printArmor();
                    buyArmor();
                    break;
                }
                case 3: {
                    out.println("You can come back any time.");
                    showMenu=false;
                    return true;
                }
            }
            return true;
        }
        return true;
    }


    public void printWeapon() {
        Weapons.printAllWeaponsInfo();
    }

    public void printArmor() {
        Armors.printAllArmorsInfo();
    }

    public void buyWeapon() {





        out.println("Type weapon id, you want to buy.");
        String tempSelect;
        int tempRight = RIGHT;
        int selectedId = 0;
        boolean showMenu=true;

        tempSelect = input.nextLine();
        try {
            selectedId = Integer.parseInt(tempSelect);
            if (selectedId < 0 && selectedId > 3) {
                out.println("type a valid number noob.");
                tempRight--;
            }
        } catch (Exception e) {
            tempRight--;
            if (tempRight == 0) {
                out.println("you fucking idiot. Go and learn how to type.");
                System.exit(0);
            } else {
                out.println("type a valid number noob.");
            }
        }






    }

    public void buyArmor() {

    }
}
