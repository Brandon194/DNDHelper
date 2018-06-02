package character;

public class Stats {

    int[][] abilityScores = new int[6][2];
    int[][] savingThrows = new int[6][2];
    int[][] skills = new int[18][2];
    int[] armor = new int[2];
    int[] init = new int[2];

    int speed = 30;
    int prof = 2;

    public Stats(int[] stats){
        for (int i=0;i<abilityScores.length;i++){
            abilityScores[i][0] = stats[i];
            savingThrows[i][0] = getMod(abilityScores[i][0] + abilityScores[i][1]);
        }

        genSkills();
    }

    public void genSkills(){
        skills[0][0] = getMod(abilityScores[0][0] + abilityScores[0][1]);
        skills[1][0] = getMod(abilityScores[1][0] + abilityScores[1][1]);
        skills[2][0] = getMod(abilityScores[2][0] + abilityScores[2][1]);
        skills[3][0] = getMod(abilityScores[3][0] + abilityScores[3][1]);
        skills[4][0] = getMod(abilityScores[4][0] + abilityScores[4][1]);
        skills[5][0] = getMod(abilityScores[5][0] + abilityScores[5][1]);
        skills[6][0] = getMod(abilityScores[6][0] + abilityScores[6][1]);
        skills[7][0] = getMod(abilityScores[7][0] + abilityScores[7][1]);
        skills[8][0] = getMod(abilityScores[8][0] + abilityScores[8][1]);
        skills[9][0] = getMod(abilityScores[9][0] + abilityScores[9][1]);
        skills[10][0] = getMod(abilityScores[10][0] + abilityScores[10][1]);
        skills[11][0] = getMod(abilityScores[11][0] + abilityScores[11][1]);
        skills[12][0] = getMod(abilityScores[12][0] + abilityScores[12][1]);
        skills[13][0] = getMod(abilityScores[13][0] + abilityScores[13][1]);
        skills[14][0] = getMod(abilityScores[14][0] + abilityScores[14][1]);
        skills[15][0] = getMod(abilityScores[15][0] + abilityScores[15][1]);
        skills[16][0] = getMod(abilityScores[16][0] + abilityScores[16][1]);
        skills[17][0] = getMod(abilityScores[17][0] + abilityScores[17][1]);
    }

    public int getMod(int i){
        return (i/2)-5;
    }

}
