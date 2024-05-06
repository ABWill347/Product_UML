package InClassUml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class CartTest {

    @Test
    void subTotal(){
        Fries fries=new Fries(1,"Waffle Fries",Size.L,2.99,5);
        Soda soda=new Soda(2,"Dr pepper",Size.s,1.99,2);
        Shirt shirt=new Shirt(3,"Henley shirt",Size.XXL,15.99,2);
        Sweater sweater =new Sweater(4,"Cashmere sweater",Size.M,25.99,12);
        Hat hat =new Hat(5,"Nike golf hat",Size.XL,10.99,2);
        ArrayList<Product> products = new ArrayList<>();
        products.add(fries);
        products.add(soda);
        Cart cart = new Cart(products);
        Assertions.assertEquals(4.98,cart.subTotal());

    }

}