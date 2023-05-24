import java.util.Scanner;

import static java.lang.System.*;

public class Game {
    private Player player;
    private static Scanner input;
    private final int RIGHT=3;


    public void start() {
        input = new Scanner(in);
        //System.out.print("Type a name for your character:");
        //String name=input.nextLine();
        player = new Player("name");
        System.out.println("name" + ", you are welcome to this dark and terrifying world.\nCharacters:");
        player.getAllCharsInfo();
        int charId=0;
        String tempId;
        boolean check = true;
        int tempRight=RIGHT;

        while (tempRight > 0 && check) {
            out.print("type an id to choose a character: ");
            tempId = input.nextLine();
            tempRight--;
            try {
                charId = Integer.parseInt(tempId);
                if (charId > 0 && charId < 4) {
                    check = false;
                }
            } catch (Exception e) {
                if (tempRight == 0) {
                    out.println("you fucking idiot. Go and learn how to type.");
                } else {
                    out.println("type a number noob.");
                }
            }
        }

        player.initPlayer(charId);


        tempRight=RIGHT;
        check=true;
        while (tempRight>0&&check)
        {
            player.printCurrentInfo();
            System.out.println("Select a Location");
            System.out.println("==================Locations===============");
            System.out.println("1. Home==>> Here is a safe place and your health will be restored. " +
                    "\n2. Tool Store==>> Here, you can buy armor and weapon.\n3. Cave==>>Award <food> but be careful of zombie.\n4. Forest==>>Award <Wood> but be careful of vampire." +
                    "\n5. River==>> Award<Water> but be careful of bear. \n0. Exit Game.");
            int selectLoc = input.nextInt();


        }




    }
}
