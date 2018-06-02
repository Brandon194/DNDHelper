package character;

public class Inventory {

    private Item[] inventory;

    public Inventory(){
        inventory = new Item[30];
    }

    public void addItem(Item item){
        for (int i=0;i<inventory.length;i++){
            if (inventory[i] == null){
                inventory[i] = item;
                return;
            }
        }

        expandArray();
        addItem(item);
    }

    public void addItem(String name, int weight){
        addItem(new Item(name,weight));
    }

    public void expandArray(){
        Item[] temp = new Item[inventory.length+1];

        for (int i=0;i<inventory.length;i++){
            temp[i] = inventory[i];
        }
    }

}
