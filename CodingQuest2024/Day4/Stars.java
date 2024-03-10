import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.lang.Math;

public class Stars{
    public static void main(String[] args) throws IOException{
        
        List<String> txtFile = new ArrayList<String>();
        txtFile = Files.readAllLines(Paths.get("CodingQuest2024/Day4/StarDistance.txt"));
        
        /*
         * Converting StarDistance.txt into 1D Array first.
         */
        String[] unorganizedDistances = txtFile.toArray(new String[181]);
        
        String[][] distances = new String[180][5]; //Creating 2D array for StarDistance.txt for later.

        /*
         * Organizing StarDistance.txt into a 2D array.
         */
        for(int r = 0; r < distances.length; r++){
            distances[r][0] = unorganizedDistances[r + 1].substring(0, 30).trim();
            distances[r][1] = unorganizedDistances[r + 1].substring(30, 44).trim();
            distances[r][2] = unorganizedDistances[r + 1].substring(47, 54).trim();
            distances[r][3] = unorganizedDistances[r + 1].substring(54, 64).trim();
            distances[r][4] = unorganizedDistances[r + 1].substring(64).trim();
        }

        /*
         * Will hold distances from star to star.
         */
        ArrayList<Double> starToStar = new ArrayList<Double>();

        /*
         * Using my fav pythagorean theorem to find distance between stars
         * and adding values to starToStar arrayList.
         */
        for(int d = 0; d < distances.length; d++){
            for(int o = d + 1; o < distances.length; o++){
                double deltaX = Double.parseDouble(distances[d][2]) - Double.parseDouble(distances[o][2]); // <-- unnecessary.
                starToStar.add(Math.sqrt(Math.pow(deltaX, 2) + Math.pow(Double.parseDouble(distances[d][3]) - Double.parseDouble(distances[o][3]), 2) + Math.pow(Double.parseDouble(distances[d][4]) - Double.parseDouble(distances[o][4]), 2)));
            }
        }
        
        /*
         * Finding the shortest distance between stars and printing that value in console.
         */
        double min = starToStar.get(0);
        for(int a = 1; a < starToStar.size(); a++){
            if(starToStar.get(a) < min){
                min = starToStar.get(a);
            }
        }System.out.println("The shortest distance between stars is: " + min + ".");

    }
}