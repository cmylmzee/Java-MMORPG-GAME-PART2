import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogParser {

    public static void main(String[] args) throws FileNotFoundException {

        //TODO: Read file into a list of player scores (List of PlayerScore)
        String[][] strings = new String[8][7];
        String path = "C:\\Users\\yilma\\IdeaProjects\\JavaMMORPGGAME\\src\\encounterLogs.csv";
        String line = "";
        Scanner scanner = null;
        int rowC = 0;
        int row = 0;
        int colC = 0;
        int col = 0;
        String inputLine = "";
        double xnum = 0;
        ArrayList<PlayerScore> PlayerScore = new ArrayList<>();

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(path)));
            while (scanner.hasNextLine()){
                inputLine = scanner.nextLine();

                String[] inArrays =  inputLine.split(",");
                for (int i = 0; i < inArrays.length ; i++){
                    strings[rowC][i] = inArrays[i];

                }

                rowC++;

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for (int i = 1; i < 8; i++) {
            PlayerScore playerScore = new PlayerScore();
            if (playerScore != null) {

                playerScore.setPlayerName(strings[i][0]);
            playerScore.setRole(strings[i][1]);
            playerScore.setDamageDealt(Integer.parseInt(strings[i][2])); // I use Integer.parseInt transformation because string Array type is String and DamageDealt type is int.
            playerScore.setDamageReceived(Integer.parseInt(strings[i][3]));
            playerScore.setHealingDone(Integer.parseInt(strings[i][4]));
            playerScore.setHealingReceived(Integer.parseInt(strings[i][5]));
            playerScore.setAttacks(Integer.parseInt(strings[i][6]));
            PlayerScore.add(playerScore);

            }

        }



        // Query 1: Damage received by the player named Chopper.  I use compareTo method because best way to compare for Strings
        //TODO
        for (int i = 0; i < 7; i++) {
            if(PlayerScore.get(i).getPlayerName().compareTo("Chopper") == 0 ){
                System.out.println("Damage received by the player named Chopper " + PlayerScore.get(i).getDamageReceived());
            }
        }

        // Query 2: List of healers' names that did more healing than 300 (HealingDone > 300)
        //TODO
        List listOfHealersName = new ArrayList();
        for (int i = 0; i < 7; i++) {


            if(PlayerScore.get(i).getRole().compareTo("Healer") == 0 ){
                if(PlayerScore.get(i).getHealingDone() > 300){

                    listOfHealersName.add(PlayerScore.get(i).getPlayerName());
                }
            }
        }
        System.out.println("\nList of healers’ names that did more healing than 300 is:");
        for (int i = 0; i < listOfHealersName.size(); i++) {
            System.out.println(listOfHealersName.get(i)+"\n");
        }

        // Query 3: Damage dealt per damage received ratio for tanks
        //TODO
        for (int i = 0; i < 7; i++) {


            if(PlayerScore.get(i).getRole().compareTo("Tank") == 0 ){
               double ratio = (double)PlayerScore.get(i).getDamageDealt() / (double)PlayerScore.get(i).getDamageReceived();
               System.out.println("Damage dealt per damage received ratio for " + PlayerScore.get(i).getPlayerName() + " is " + ratio);
            }
        }

        // Query 4: The name of the damage dealer that dealt the least amount of damage per attack (DamageDealt/Attacks)
        //TODO
        PlayerScore playerScore2 = new PlayerScore();
        double minDamageDealtAttacks = PlayerScore.get(0).getDamageDealt() / PlayerScore.get(0).getAttacks();
        for (int i = 1; i < 7; i++) {


            if(PlayerScore.get(i).getDamageDealt() / PlayerScore.get(i).getAttacks() < minDamageDealtAttacks){
                minDamageDealtAttacks = PlayerScore.get(i).getDamageDealt() / PlayerScore.get(i).getAttacks();
                playerScore2 = PlayerScore.get(i);

            }else{
                continue;
            }


        }

        System.out.println("\nThe name of the damage dealer that dealt the least amount of damage per attack (DamageDealt/Attacks) : " + playerScore2.getPlayerName());

        // Query 5: How much healing was received by the tank that dealt the most damage
        //TODO
        int mostDamageDealt  =  PlayerScore.get(5).getDamageDealt();
        PlayerScore playerScore3 = new PlayerScore();
        for (int i = 0; i < 7; i++) {


            if(PlayerScore.get(i).getRole().compareTo("Tank") == 0 ){
                if(mostDamageDealt < PlayerScore.get(i).getDamageDealt()){
                    mostDamageDealt = PlayerScore.get(i).getDamageDealt();
                    playerScore3 = PlayerScore.get(i);
                }else{
                    playerScore3 = PlayerScore.get(5);
                }

            }
        }

        System.out.println("\nHow much healing was received by the tank that dealt the most damage : " + playerScore3.getHealingReceived() );


    }

}