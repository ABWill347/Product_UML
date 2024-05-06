package InClassUml;


public class User {
    private  int iD;//final
    private static int sharedID=0;
    private Cart cart;


    public User(Cart initializeCart){
        this.iD = sharedID++;
        this.cart = initializeCart;
    }
    public void addToCart(Product product, int qty) {
        if (qty <= 0) {
            System.out.println("Invalid amount " + qty);
            return;
        }
        if (product == null) {
            System.out.println("Invalid product");
            return;
        }
        if (qty > product.getInventory()) {
            System.out.println("Not enough stock available for " + product.getName());
            return;
        }
       cart.addProduct(product);
        System.out.println(qty + " " + product.getName() + " added to cart.");

    }







    private void removeFromCart(Product product,int qty){

    }

    public int getiD() {
        return iD;
    }
}
