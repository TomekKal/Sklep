public class DataBase {

    Item[] items = new Item[6];

    public DataBase(){

        this.items[0] = new Item("Mlotek", "MK-001", 4, 10.00 );
        this.items[1] = new Item("Gwóżdź", "SR-002", 100, 0.40);
        this.items[2] = new Item("Piła", "PL-001", 4, 8.00 );
        this.items[3] = new Item("Kosa", "KO-001", 1, 17.00 );
        this.items[4] = new Item("Wkręt", "WK-001", 200, 0.50 );
        this.items[5] = new Item("Koparka", "KO-002", 0, 2000000.00);

    }

    void countItemToBuy(String name){

        String nametoBuy;
        for(Item item : this.items) {
            if(item.name.equals(name)){
                System.out.println("Dostępne: "+item.quantity);
                item.willbeBuy = true;
            }
        }
        System.out.println("");
    }

    void itemToBuy(int quantity){
        for(Item item : this.items) {

            //item.willbeBuy == true
            if (item.willbeBuy) {
                if (quantity <= item.quantity){
                    System.out.println("Kupiłeś: " + item.name + "\t" + quantity+ "szt."  + "\tw cenie " +quantity * item.price + " zł");
                    item.quantity = item.quantity - quantity;
                } else {
                    System.out.println("Wybrana licza sztuk jest większa od stanu magazynowego\n");
                }

            }
            item.willbeBuy = false;
        }



    }


}



   /* boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.plate.equals(plate)) {
                if(!car.rent) {
                    car.rent = true;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }*/
