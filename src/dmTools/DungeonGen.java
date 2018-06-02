package dmTools;

import java.util.ArrayList;
import java.util.List;

//pg 290

public class DungeonGen {

    public String startingArea;
    public int numOfPassages = 0;
    public List<String> passages = new ArrayList<String>();

    public int numOfDoors = 0;
    public List<String> doors = new ArrayList<String>();
    public List<String> doorType = new ArrayList<String>();

    public int numOfChambers = 0;
    public List<String> chambers = new ArrayList<String>();

    public int numOfExits = 0;
    public List<String> exits = new ArrayList<String>();


    private void getStartingArea(){
        int random = (int) Math.random()*194%10 + 1;

        switch(random){
            case 1: startingArea = "Square, 20x20 ft; passage on wall"; numOfPassages+=1; break;
            case 2: startingArea = "Square, 20x20ft; door on two walls, passage in third wall"; numOfPassages+=1; numOfDoors+=2; break;
            case 3: startingArea = "Square, 40x40ft; door on three walls"; numOfDoors+=3; break;
            case 4: startingArea = "Rectangle, 80x20ft with row of pillars down the middle; two passages leading from each long wall,doors on each short wall"; numOfPassages+=2; numOfDoors+=2; break;
            case 5: startingArea = "Rectangle, 20x40ft; passage on each wall"; numOfPassages+=3; break;
            case 6: startingArea = "Circle, 40ft; one passage in each cardinal direction; well in middle of room (might lead down to lower level"; numOfPassages+=3; break;
            case 7: startingArea = "Circle 40ft; one passage in each cardinal direction"; numOfPassages+=3; break;
            case 8: startingArea = "Square 20x20ft; door on two walls, passage on third wall, secret door on fourth wall"; numOfDoors+=3; numOfPassages+=1; break;
            case 9: startingArea = "Passage, 10ft wide; T intersection"; numOfPassages+=2; break;
            case 10: startingArea = "Passage, 10ft wide; four way intersection"; numOfPassages+=3; break;
        }
    }

    private void getPassage(){
        int random1 = (int) Math.random()*194%20 + 1;

        switch(random1){
            case 1: passages.add("Continue straight 30ft, no doors or side passages"); break;
            case 2: passages.add("Continue straight 30ft, no doors or side passages"); break;
            case 3: passages.add("Continue straight 20ft. door to the left then additional 10ft ahead"); numOfDoors+=1; break;
            case 4: passages.add("Condinue straight 20ft. side passage to the right, then an additional 10ft ahead"); numOfPassages+=1; break;
            case 5: passages.add("Continue straight 20ft. passage ends in a door"); numOfDoors+=1; break;
            case 6: passages.add("Continue staright 20ft side passage to the right then an additional 10ft ahead"); numOfPassages+=1; break;
            case 7: passages.add("Continue staright 20ft side passage to the right then an additional 10ft ahead"); numOfPassages+=1; break;
            case 8: passages.add("Continue straight 20ft, comes to dead end; 10% chance of secret door"); random1*=194; random1=random1%10; if (random1 == 0) numOfDoors+=1; break;
            case 9: passages.add("Continue straight 20ft, comes to dead end; 10% chance of secret door"); random1*=194; random1=random1%10; if (random1 == 0) numOfDoors+=1; break;
            case 10: passages.add("Continue straight 20. then the passage turns right and continues 10ft."); numOfPassages+=1; break;
            case 11: passages.add("Continue straight 20ft. then the passage turns left and continues 10ft"); numOfPassages+=1; break;
            case 12: passages.add("Continue straight 20ft. then the passage turns left and continues 10ft"); numOfPassages+=1; break;
            case 13: passages.add("Continue straight 20ft. then the passage turns right and continues 10ft"); numOfPassages+=1; break;
            case 14: passages.add("Continue straight 20ft. then the passage turns right and continues 10ft"); numOfPassages+=1; break;
            case 15: passages.add("Chamber"); numOfChambers+=1; break;
            case 16: passages.add("Chamber"); numOfChambers+=1; break;
            case 17: passages.add("Chamber"); numOfChambers+=1; break;
            case 18: passages.add("Chamber"); numOfChambers+=1; break;
            case 19: passages.add("Chamber"); numOfChambers+=1; break;
            case 20: passages.add("Stairs"); break;
        }
    }
    private void getDoor(){
        int doorT = (int) Math.random()*194%20;
        int beyondADoor = (int) Math.random()*194%20;

        switch(doorT){
            case 1: doorType.add("Wooden"); break;
            case 2: doorType.add("Wooden"); break;
            case 3: doorType.add("Wooden"); break;
            case 4: doorType.add("Wooden"); break;
            case 5: doorType.add("Wooden"); break;
            case 6: doorType.add("Wooden"); break;
            case 7: doorType.add("Wooden"); break;
            case 8: doorType.add("Wooden"); break;
            case 9: doorType.add("Wooden"); break;
            case 10: doorType.add("Wooden"); break;
            case 11: doorType.add("Wooden, barred or locked"); break;
            case 12: doorType.add("Wooden, barred or locked"); break;
            case 13: doorType.add("Stone"); break;
            case 14: doorType.add("Stone, barred or locked"); break;
            case 15: doorType.add("Iron"); break;
            case 16: doorType.add("Iron, barred or locked"); break;
            case 17: doorType.add("Portcullis"); break;
            case 18: doorType.add("Portcullis, barred or locked"); break;
            case 19: doorType.add("Secret door"); break;
            case 20: doorType.add("Secret door, barred or locked"); break;
        }

        switch(beyondADoor){
            case 1: doors.add("Passage extends 10ft. then T intersection"); numOfPassages+=2; break;
            case 2: doors.add("Passage extends 10ft. then T intersection"); numOfPassages+=2; break;
            case 3: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 4: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 5: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 6: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 7: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 8: doors.add("Passage 20ft straight ahead"); numOfPassages+=1; break;
            case 9: doors.add("Chamber"); numOfChambers+=1; break;
            case 10: doors.add("Chamber"); numOfChambers+=1; break;
            case 11: doors.add("Chamber"); numOfChambers+=1; break;
            case 12: doors.add("Chamber"); numOfChambers+=1; break;
            case 13: doors.add("Chamber"); numOfChambers+=1; break;
            case 14: doors.add("Chamber"); numOfChambers+=1; break;
            case 15: doors.add("Chamber"); numOfChambers+=1; break;
            case 16: doors.add("Chamber"); numOfChambers+=1; break;
            case 17: doors.add("Chamber"); numOfChambers+=1; break;
            case 18: doors.add("Chamber"); numOfChambers+=1; break;
            case 19: doors.add("Stairs"); break;
            case 20: doors.add("False door with trap"); break;
        }
    }

    public void getChamber(){
        int chamber  = (int) Math.random()*194%20;
        int chamberExits  = (int) Math.random()*194%20;
        String returnable = "";

        switch(chamber) {
            case 1: returnable = ("Square, 20x20ft"); break;
            case 2: returnable = ("Square, 20x20ft"); break;
            case 3: returnable = ("Square, 30x30ft"); break;
            case 4: returnable = ("Square, 30x30ft"); break;
            case 5: returnable = ("Square, 40x40ft"); break;
            case 6: returnable = ("square, 40x40ft"); break;
            case 7: returnable = ("Rectangle, 20x30ft"); break;
            case 8: returnable = ("Rectangle, 20x30ft"); break;
            case 9: returnable = ("Rectangle, 20x30ft"); break;
            case 10: returnable = ("Rectangle, 30x40ft"); break;
            case 11: returnable = ("Rectangle, 30x40ft"); break;
            case 12: returnable = ("Rectangle, 30x40ft"); break;
            case 13: returnable = ("Rectangle, 40x50ft"); break;
            case 14: returnable = ("Rectangle, 40x50ft"); break;
            case 15: returnable = ("Rectangle, 50x80ft"); break;
            case 16: returnable = ("Circle, 30ft"); break;
            case 17: returnable = ("Circle, 50ft"); break;
            case 18: returnable = ("Octagon, 40x40ft"); break;
            case 19: returnable = ("Octagon, 60x60ft"); break;
            case 20: returnable = ("Trapezoid, 40x60ft"); break;
        }

        if (chamber <= 12){
            switch(chamberExits){
                case 1: returnable = returnable + "; 0 exits";
                case 2: returnable = returnable + "; 0 exits";
                case 3: returnable = returnable + "; 0 exits";
                case 4: returnable = returnable + "; 0 exits";
                case 5: returnable = returnable + "; 0 exits";
                case 6: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 7: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 8: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 9: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 10: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 11: returnable = returnable + "; 1 exits"; numOfExits++; break;
                case 12: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 13: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 14: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 15: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 16: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 17: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 18: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 19: returnable = returnable + "; 4 exits"; numOfExits+=4; break;
                case 20: returnable = returnable + "; 4 exits"; numOfExits+=4; break;
            }
        } else if (chamber >= 13){
            switch(chamberExits){
                case 1: returnable = returnable + "; 0 exits";
                case 2: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 3: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 4: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 5: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 6: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 7: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 8: returnable = returnable + "; 1 exits"; numOfExits+=1; break;
                case 9: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 10: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 11: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 12: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 13: returnable = returnable + "; 2 exits"; numOfExits+=2; break;
                case 14: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 15: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 16: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 17: returnable = returnable + "; 3 exits"; numOfExits+=3; break;
                case 18: returnable = returnable + "; 4 exits"; numOfExits+=4; break;
                case 19: returnable = returnable + "; 5 exits"; numOfExits+=5; break;
                case 20: returnable = returnable + "; 6 exits"; numOfExits+=6; break;
            }
        }

            chambers.add(returnable);
    }
}
