import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class DiceLogic{
    ArrayList<Integer> listOfScorePlayer1 = new ArrayList<Integer>();    //Lista som håller alla tärningsslag för spelare 1
    ArrayList<Integer> listOfScorePlayer2 = new ArrayList<Integer>();    //Lista som håller alla tärningsslag för spelare 2
    Random rand = new Random();
    int livesTrackerPlayer1 = 0;   //Håller koll på hur många liv spelare 1 har förlorat
    int livesTrackerPlayer2 = 0;   //Håller koll på hur många liv spelare 2 har förlorat


    public DiceLogic(){

    }

    //TODO TIMER PÅ 30 SEK ANNARS FÖRLORAR SPELARE MED LÄGST POÄNG ETT LIV

//METODER FÖR SPELARE 1
     public void rollDicePlayer1(JButton takePointsPlayer1, JButton lives1, JButton lives2, JButton lives3 ){
         int dice = rand.nextInt(6) + 1;
         if (dice == 1) {
             listOfScorePlayer1.clear();
             takePointsPlayer1.doClick();
             livesTrackerPlayer1++;
             if (livesTrackerPlayer1 == 1){
                 lives1.setVisible(false);
             }
             else if (livesTrackerPlayer1 == 2){
                 lives2.setVisible(false);
             }
             else if (livesTrackerPlayer1 == 3){
                 lives3.setVisible(false);
                 JOptionPane.showMessageDialog(null, "Spelare 2 VANN GRATTIS!");
             }
         }
         else{
             listOfScorePlayer1.add(dice);
         }
         }

    public void getSumPlayer1(JLabel scoreTrackerPlayer1){
        int sum = 0;
        for (int i : listOfScorePlayer1) {
            sum += i;
        }
        scoreTrackerPlayer1.setText(String.valueOf(sum));
    }

    // METODER FÖR SPELARE 2
    public void rollDicePlayer2(JButton takePointsPlayer2, JButton lives1, JButton lives2, JButton lives3 ){
        int dice = rand.nextInt(6) + 1;
        if (dice == 1) {
            listOfScorePlayer2.clear();
            takePointsPlayer2.doClick();
            livesTrackerPlayer2++;
            if (livesTrackerPlayer2 == 1){
                lives1.setVisible(false);
            }
            else if (livesTrackerPlayer2 == 2){
                lives2.setVisible(false);
            }
            else if (livesTrackerPlayer2 == 3){
                lives3.setVisible(false);
                JOptionPane.showMessageDialog(null, "Spelare 1 VANN GRATTIS!");
            }
        }
        else{
            listOfScorePlayer2.add(dice);
        }
    }

    public void getSumPlayer2(JLabel scoreTrackerPlayer2){
        int sum = 0;
        for (int i : listOfScorePlayer2) {
            sum += i;
        }
        scoreTrackerPlayer2.setText(String.valueOf(sum));
    }
}
