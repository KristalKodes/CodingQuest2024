package Practice;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class Practice2022{
    public static void main(String[] args) throws IOException{

        int totalFood = 0;
        int totalFrozen = 0;
        int totalFuel = 0;
        int totalMechanical = 0;
        int totalWater = 0;
        int totalSundry = 0;
        int totalCleaning = 0;

        List<String> allScans = new ArrayList<String>();
        allScans = Files.readAllLines(Paths.get("CodingQuest2024/Practice/Scans.txt"));
        
        int totalScans = 0;
        for(int i = 0; i < allScans.size(); i++){
            String category = allScans.get(i).substring(43);
            int quantity = Integer.parseInt(allScans.get(i).substring(37, 42));
            totalScans = totalScans + 1;
            if(category.equals("Food")){
                totalFood = totalFood + quantity;
            }else if(category.equals("Frozen")){
                totalFrozen = totalFrozen + quantity;
            }else if(category.equals("Fuel")){
                totalFuel = totalFuel + quantity;
            }else if(category.equals("Mechanical")){
                totalMechanical = totalMechanical + quantity;
            }else if(category.equals("Sundry")){
                totalSundry = totalSundry + quantity;
            }else if(category.equals("Cleaning")){
                totalCleaning = totalCleaning + quantity;
            }else{
                totalWater = totalWater + quantity;
            }
        }
        /*
         * >:( I don't know why my answer is incorrect.
         */
        System.out.println(totalFood + " " + totalFrozen + " " + totalFuel + " " + totalMechanical + " " + totalSundry + " " + totalCleaning + " " + totalWater);

        System.out.println((totalFood % 100) + " " + (totalFrozen % 100) + " " + (totalFuel % 100) + " " + (totalMechanical % 100)  + " " + (totalSundry % 100) + " " + (totalCleaning % 100) + " " + (totalWater % 100));
        System.out.println((totalFood % 100) * (totalFrozen % 100) * (totalFuel % 100) * (totalMechanical % 100) * (totalSundry % 100) * (totalCleaning % 100) * (totalWater % 100));
    }
}
