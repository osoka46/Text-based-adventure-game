import java.util.Scanner;

import static java.lang.System.*;

public class Game {
    private Player player;
    private static Scanner input;
    private int charsQuantity;

    public void start() {
        input = new Scanner(in);
        //System.out.print("Type a name for your character:");
        //String name=input.nextLine();
        player = new Player("name");
        System.out.println("name" + ", you are welcome to this dark and terrifying world.\nCharacters:");
        player.getCharInfo();
        int charId=0;
        String tempId;
        charsQuantity = Character.charsQuantity();
        boolean check = true;

        while (charsQuantity > 0 && check) {
            out.print("type an id: ");
            tempId = input.nextLine();
            charsQuantity--;
            try {
                charId = Integer.parseInt(tempId);
                if (charId > 0 && charId < 4) {
                    check = false;
                }
            } catch (Exception e) {
                if (charsQuantity == 0) {
                    out.println("you fucking idiot. Go and learn how to type.");
                } else {
                    out.println("type a number noob.");
                }
            }
        }
        player.initPlayer(charId);
    }
}
