import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class Practice2022{
    public static void main(String[] args) throws IOException{
        
        List<Item> items = new ArrayList<Item>();
        List<String> allScans = new ArrayList<String>();
        allScans = Files.readAllLines(Paths.get("Scans.txt"));
        
        for(int i = 0; i < allScans.size(); i++){
            items.add(new Item(allScans.get(i)));
        }

        for(int i = 0; i < items.size(); i ++){
            if(items.get(i).getCategory().equals("Food")){
                items.set(i, new Food(items.get(i).getQuantity()));
            }else if(items.get(i).getCategory().equals("Frozen")){
                items.set(i, new Frozen(items.get(i).getQuantity()));
            }else if(items.get(i).getCategory().equals("Fuel")){
                items.set(i, new Fuel(allScans.get(i)));
            }else if(items.get(i).getCategory().equals("Mechancial")){
                items.set(i, new Mechanical(items.get(i).getQuantity()));
            }else{
                items.set(i, new Water(items.get(i).getQuantity()));
            }
        }

        System.out.println(Frozen.FrozenQuantity + " ");
    }
}
