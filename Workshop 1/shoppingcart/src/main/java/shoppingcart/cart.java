package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class cart {

    public List<String> addItem(List<String> list, String s) {
        String[] stringOfArray = s.split(",");
        for (String item:stringOfArray){
            if(!list.contains(item)){
                list.add(item);
                System.out.println(item +" added");
            }
            else
            System.out.println("Item already in cart");
        }
        return list;
    }


    public List<String> deleteItem(List<String> list, int i) throws NumberFormatException, IndexOutOfBoundsException {
        try{
            if ((i-1)<list.size() || (i-1) > list.size()){
        String itemremoved = list.get(i-1);
        System.out.printf("removed " + itemremoved +" from cart \n");
        list.remove(i-1);
        } else
        System.out.println("invalid index");
        }catch (Exception e){
            System.out.println("invalid item index and only integer");
        }
        return list;
    }

    public void getList(List<String> list) {
        if (list.size()>0){
            for (int i = 0; i<list.size();i++){
            System.out.printf("%d.%s \n",(i+1),list.get(i));
            }
        } else
        System.out.println("Your cart is empty");
    }

    

    


    
}
