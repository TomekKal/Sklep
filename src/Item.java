public class Item {

    String name;
    String catalogNumber;
    int quantity;
    double price;
    boolean willbeBuy;
    int qtToBuy;
    static int numberOfItems;

    public Item(){
        numberOfItems++;
        willbeBuy = false;
        qtToBuy = 0;
    }

    public Item(String name, String catalogNumber, int quantity, double price){
        numberOfItems++;
        willbeBuy = false;
        qtToBuy = 0;
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.quantity = quantity;
        this.price = price;
    }

}
