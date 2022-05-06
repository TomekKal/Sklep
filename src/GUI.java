public class GUI {


    void showMainMenu(){
        System.out.println("1. Wyświetl listę produktów");
        System.out.println("2. Kup produkt");
        System.out.println("3. Wyjdź ze sklepu");
    }


    void listItems(Item[] items) {
        for (Item item : items) {
            if (item.quantity > 0) {
                System.out.println(item.name + " \t" +
                        "  Numer katalogowy  " + item.catalogNumber +
                        "  Cena: " + item.price +
                        "  Liczba sztuk : " + item.quantity);
            } else {
                System.out.println(item.name + " \t" +
                        "  Numer katalogowy  " + item.catalogNumber +
                        "  Brak w magazynie ");
            }

        }
    }
}
