package com;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    public static void main(String[] args) {
        Console cons = System.console();
        List<String> shoppingCart = new ArrayList<>();
        String input = "";
        String item = "";
        String indexstring = "";
        Integer index = 0;
        System.out.println("Welcome to your shopping cart");    
            
        while (!"stop".equals(input)){
            input = cons.readLine("Type list to see your cart add to add items, delete to delete items and stop to stop adding cart \n");
            input = input.trim();
                           
                if ("list".equals(input)){
                    if (shoppingCart.isEmpty())
                        System.out.println("Your Shopping Cart is Empty");
                    else {
                    for (int i = 0; i < shoppingCart.size();i++)
                    System.out.printf("%d: %s\n",(i+1),shoppingCart.get(i));
                        }
                }else if ("stop".equals(input))
                    break;
                else if ("add".equals(input)){
                    item = cons.readLine("Item to add\n");
                    String[] strofarray = item.split(",",0);
                    for (String a:strofarray){
                        if (shoppingCart.contains(a))
                            System.out.println("Already in cart");
                        else{
                            shoppingCart.add(a);
                            System.out.printf("%s added to cart\n",a);}
                            }
                        }
                else if("delete".equals(input)){
                    indexstring = cons.readLine("input number to delete ");
                    index = Integer.parseInt(indexstring);
                    if (index <= shoppingCart.size())
                    shoppingCart.remove(index-1);
                    else if (shoppingCart.size()==0)
                    System.out.println("you have nothing in your cart");
                    else
                    System.out.println("Invalid Index");
                }
            }
        }
    }