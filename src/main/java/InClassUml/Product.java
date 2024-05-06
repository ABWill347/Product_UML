package InClassUml;

public abstract class Product {
    private final int iD;
    private static int sharedId=1;
    private Size size;
    private String name;
    private double price;
    private int inventory;

    public Product(int iD,String name,Size size,  double price,  int inventory) {
        this.size = size;
        this.iD = sharedId++;
        this.price = price;
        this.name = name;
        this.inventory = inventory;
    }

    public  int getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
