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
    }
}
