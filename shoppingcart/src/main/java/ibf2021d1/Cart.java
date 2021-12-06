package ibf2021d1;

import java.util.ArrayList;
import java.util.List;

public class Cart 
{
    List<String> cart = new ArrayList<>();

    public String listCart(){
        return cart.toString();

    }

    public void addItem(String item){
        cart.add(item);

    }

    public String deleteItem(int i){
        if (i>=cart.size()){
            return "Out of Bounds";
        }

        if (!cart.isEmpty()){
        cart.remove(i);
        return "Item Removed";
        }
        
        return "Your cart is empty";

    }

    public int numberOfItemsInCart(){
        return cart.size();
    }
}
