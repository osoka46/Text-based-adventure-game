import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class ToolHouse extends NormalLoc {
    private Weapons weapons;
    private Armors armors;
    private Scanner input;
    private final int RIGHT=3;


    public ToolHouse(Player player) {
        super(player, "ToolHouse");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to Tool Store. You can buy armors or weapons here.");
        System.out.println("Welcome to Tool Store. Type an id.\n1. Weapons\t2.Armors\t3. Exit");
        input=new Scanner(System.in);

        String tempSelect;
        boolean showMenu = true;
        int tempRight = RIGHT;
        int selectedId;

        while (tempRight >= 0 && showMenu) {
            out.print("type an id to choose a character: ");
            tempSelect = input.nextLine();
            try {
                selectedId = Integer.parseInt(tempSelect);
                if (selectedId < 0 && selectedId >3) {
                    out.println("type a valid number. 1, 2 or 3.");
                }
            } catch (Exception e) {
                if (tempRight == 0) {
                    out.println("you fucking idiot. Go and learn how to type.");
                } else {
                    out.println("type a number noob.");
                }
            }
        }


        printArmor();
        printWeapon();
        return true;
    }


    public void printWeapon() {
        Weapons.printAllWeaponsInfo();
    }

    public void printArmor() {
        Armors.printAllArmorsInfo();
    }
}
