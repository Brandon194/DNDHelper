package character;

public class Item {

    String name;
    int weight;
    int value;
    String notes;
    String abilities;
    String attack;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public Item(String name, int weight, int value, String abilties, String notes, String attack) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.notes = notes;
        this.abilities = abilties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilties) {
        this.abilities = abilties;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String toString(){
        return name + "," + weight + "," + value + "," + abilities + "," + notes + "," + attack;
    }
}
