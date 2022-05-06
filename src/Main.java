import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GUI menu = new GUI();
        DataBase base = new DataBase();
        Scanner key = new Scanner(System.in);

        while(true) {
            menu.showMainMenu();

            switch (key.nextInt()){

                case (1):
                    menu.listItems(base.items);
                    break;

                case (2):
                    System.out.println("Wpisz nazwę produktu który chcesz kupić.");
                    base.countItemToBuy(key.next());
                    System.out.println("Ile sztuk chcesz kupić.");
                    base.itemToBuy(key.nextInt());
                    break;

                case (3):
                    System.exit(0);
                    break;

            }
        }

    }
}
