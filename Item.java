
public class Item{

    private String itemNumber;
    private int quantity;
    private String category;

    public Item(String scan){
        itemNumber = scan.substring(0, 36);
        quantity = Integer.parseInt(scan.substring(37, 42));
        category = scan.substring(43);
    }

    public String getItemNumber(){
        return itemNumber;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getCategory(){
        return category;
    }
}