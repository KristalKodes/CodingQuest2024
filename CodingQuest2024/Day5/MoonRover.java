package Day5;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.lang.Math;

public class MoonRover {
    public static void main(String[] args)throws IOException{
        List<String> distancesArrayList = new ArrayList<String>();
        distancesArrayList = Files.readAllLines(Paths.get("CodingQuest2024/Day5/BaseCampDistance.txt"));
        String[] distancesArray = distancesArrayList.toArray(new String[distancesArrayList.size()]);

        String[][] distances = new String[25][25];
        for(int o = 1; o < distances.length; o++){
            int index = 7;
            for(int i = 1; i < distances[o].length; i++){
                distances[o - 1][i - 1] = distancesArray[o].substring(index, index + 8).trim();
                index = 7 + 8*(i);
            }
        }
        
        for(int i = 0; i < distances.length; i++){
            for(int l = 0; l < distances[i].length; l++){
                System.out.println(distances[i][l]);
            }
        }
    }   
}
