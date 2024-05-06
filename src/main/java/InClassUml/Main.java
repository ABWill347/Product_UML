package InClassUml;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Fries fries=new Fries(1,"Waffle Fries",Size.L,2.99,5);
Soda soda=new Soda(2,"Dr pepper",Size.s,1.99,2);
Shirt shirt=new Shirt(3,"Henley shirt",Size.XXL,15.99,2);
Sweater sweater =new Sweater(4,"Cashmere sweater",Size.M,25.99,12);
Hat hat =new Hat(5,"Nike golf hat",Size.XL,10.99,2);

ArrayList<Product> products = new ArrayList<>();

        Cart cart = new Cart(products);

        User user = new User(cart);

        user.addToCart(soda, 1);
        user.addToCart(sweater, 1);
        user.addToCart(hat, 1);
        user.addToCart(soda,1);

        System.out.println(cart.cartQty());
        System.out.println("Your total before tax is $"+cart.subTotal());
        cart.totalAfterTax();




    }
}
