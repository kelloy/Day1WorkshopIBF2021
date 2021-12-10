package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class cart {
    
    private List<String> shoppinglist = new ArrayList<>();

    public void addItem(String s) {
        String[] stringOfArray = s.split("[\\s,]");
        for (String item:stringOfArray){
            if(!shoppinglist.contains(item)){
                shoppinglist.add(item);
                System.out.println(item +" added");
            }
            else
            System.out.println("Item already in cart");
        }
    }


    public void deleteItem(int i) {
        try{
            if ((i-1)<shoppinglist.size() || (i-1) > shoppinglist.size()){
        String itemremoved = shoppinglist.get(i-1);
        System.out.printf("removed " + itemremoved +" from cart \n");
        shoppinglist.remove(i-1);
        } else
        System.out.println("invalid index");
        }catch (IndexOutOfBoundsException e){
            System.out.println("invalid item index");
        }
    }

    public void getList(){
        if (shoppinglist.size()>0){
            for (int i = 0; i<shoppinglist.size();i++){
            System.out.printf("%d.%s \n",(i+1),shoppinglist.get(i));
            }
        } else
        System.out.println("Your cart is empty");
    }

    

    


    
}
