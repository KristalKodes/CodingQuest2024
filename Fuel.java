public class Fuel extends Item{
    public static int FuelQuantity;

    public Fuel(String scan){
        super(scan);
        FuelQuantity += quantity;
    }

}