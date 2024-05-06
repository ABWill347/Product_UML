package InClassUml;


import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> arrayList;
    private final float tax = .10f;
    private Special special;

    public Cart(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    public int cartQty() {
        System.out.print("Your total items are ");
        return arrayList.size();
    }
    public double subTotal() {
        double total = 0.0;
        for (int i = 0; i < arrayList.size(); i++) {
            Product product = arrayList.get(i);
            total += product.getPrice();
        }
        return total;

    }public double totalAfterTax(){
        double totalWithTax = subTotal() + (subTotal() * tax);
        System.out.printf("Your total price after tax is $%.2f\n" , totalWithTax);
        return totalWithTax;
    }
    public void checkOut(){

    }public void addProduct(Product product){
        arrayList.add(product);
    }public ArrayList<Product> getProductList() {
        return arrayList;
    }

}
