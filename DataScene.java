import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {
  private GrammyWinners[] grammyWinnerss; // 1D Array of GrammyWinners Objects
  private String soundFile1;
  private String soundFile2;
   
  // Constructor accepting sound files
  public DataScene(String soundFile1, String soundFile2) {
    this.soundFile1 = soundFile1;
    this.soundFile2 = soundFile2;
    grammyWinnerss = createGrammyWinnerss();
  }
 
  // Returns a 1D array of GrammyWinners objects using the txt files in this project
  public GrammyWinners[] createGrammyWinnerss() {
    String[] nomineeArray = FileReader.toStringArray("Nominee.txt");  // Corrected typo
    String[] categoryArray = FileReader.toStringArray("Category.txt"); // Corrected typo
    int[] yearArray = FileReader.toIntArray("Year.txt");

    // Assuming all arrays are the same length
    int length = nomineeArray.length;
    GrammyWinners[] grammyWinnersArray = new GrammyWinners[length];

    for (int i = 0; i < length; i++) {
      grammyWinnersArray[i] = new GrammyWinners(yearArray[i], categoryArray[i], nomineeArray[i]);
    }

    return grammyWinnersArray;
  }

  // Draws the animation
  public void drawScene() {
    int randomIndex = (int) (Math.random() * grammyWinnerss.length);
    GrammyWinners winner = grammyWinnerss[randomIndex];  // Corrected variable name

    // If-else statement using an OR operator to display the correct image based on the winner
    if (winner.getNominee().equals("We got us.") || winner.getCategory().equals("Best Performance by a Vocal Group (2 To 6)")) {
      clear("white");
      drawImage("GrammyWinners2.jpg", 50, 50, 300);
    } else if (winner.getNominee().equals("Gigi")) {
      clear("white");
      drawImage("GrammyWinners3.jpg", 50, 50, 300);
    }

    // Play sound files (uncomment to enable)
    // playSound(soundFile1);
    // playSound(soundFile2);

    pause(1);

    // Display winner text
    drawText(winner.toStringNominee(), 20, 150);
    drawText(winner.toStringCategory(), 20, 200);
    drawText(winner.toStringYear(), 20, 250);
    
    System.out.println(winner);
  }
}
