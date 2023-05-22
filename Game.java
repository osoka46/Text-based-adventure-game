import java.util.Scanner;

import static java.lang.System.*;

public class Game {
    private Player player;
    private static Scanner input;
    private int charsQuantity;

    public void start() {
        // input=new Scanner(in);
        //System.out.print("Type a name for your character:");
        //String name=input.nextLine();
        player = new Player("name");
        System.out.println("name" + ", you are welcome to this dark and terrifying world.\nCharacters:");
        player.getCharInfo();
        out.println("type a id ");
        while (charsQuantity)

    }
}
