package Day3;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
public class DoorCode {
    public static void main(String[] args) throws IOException{
        
        List<Integer> runLength = new ArrayList<Integer>();
        List<String> unorganizedRunLength = new ArrayList<String>();
        unorganizedRunLength = Files.readAllLines(Paths.get("CodingQuest2024/Day3/RunLength.txt"));
        
        /*
         * Organizes each number in the RunLength file into an arrayList.
         */
        int u = 0;
        while(u < unorganizedRunLength.get(0).length()){
            String thisSection = unorganizedRunLength.get(0).substring(u);
            runLength.add(Integer.parseInt(thisSection.substring(0, thisSection.indexOf(" "))));
            u += unorganizedRunLength.get(0).substring(u).indexOf(" ") + 1;
        }

        /*
         * Prints the #'s and periods into a
         * 100 row by 80 column format.
         */
        int divideByTen = 1;
        int everyOther = 0;
        for(int r = 0; r < runLength.size(); r++){
            int number = (runLength.get(r));
            everyOther++;
            String pixel = ".";

            if((everyOther % 2) == 0){
                pixel = "#";
            }

            for(int n = 1; n <= number; n++){
                if(divideByTen != 100){
                    System.out.print(pixel);
                    divideByTen += 1;
                }else{
                    System.out.println(pixel);
                    divideByTen = 1;
                }
            }
        }
    }
}
