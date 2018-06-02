package character;

public class Character {

    private String name;
    private Role role;
    private Race race;

    private String background;
    private String alignment;
    private int experience;

    private Inventory inventory = new Inventory();

    public Character(String name){
        this.name = name;
        this.role = Role.random();
        this.race = Race.random();

        background = "";
        alignment = "N/N";
        experience = 0;
    }
}
