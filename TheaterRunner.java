// Abigail Booranasomphop & Jalyssa De La Torre

import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

// Inistiate DatatScene object to be displaed in Theater
    DataScene scene = new DataScene("clapping.wav", "cheering.wav");


// Call DataScene methods to be displayed
    scene.drawScene();


// Play DataScene in 
    Theater.playScenes(scene);
    
  }
}
