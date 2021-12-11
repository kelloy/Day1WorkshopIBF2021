package shoppingcart;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class shoppingCart {
    static Scanner scan = new Scanner(System.in);
    static cart action = new cart();
    static String items = "";
    static String command = "";
    static String[] arrayOfitem;
    static List<String> shoppinglist;
    static loginhandle login = new loginhandle();
    static String dirpath;
    static String filepath;

    public static void main(String[] args) throws IOException {
        dirpath = login.createDirectory();
        filepath = login.checkFile(dirpath);
        shoppinglist = loginhandle.readfile(filepath);
        
        System.out.println("Welcome to your shopping cart");

            while(!"exit".equals(command)){
                command = scan.next();
                items = scan.nextLine();
                items = items.trim();
                
            if("add".equals(command)){
               action.addItem(shoppinglist,items);
               login.save(filepath, shoppinglist);
            }
            else if("delete".equals(command)){
                Integer i = Integer.parseInt(items);
                action.deleteItem(shoppinglist, i);
                login.save(filepath, shoppinglist);
            }
            else if("list".equals(command)){
                action.getList(shoppinglist);
            }
            else if("save".equals(command)){
                if (filepath == "null")
                login.save(filepath,shoppinglist);
                System.out.println("Your cart has been saved");
                
            }else if("users".equals(command)){
                File folder = new File(dirpath);
                login.userlist(folder);
            }
            else if("exit".equals(command))
            break;
            else{
                System.out.println("Invalid Input. Please input \"add\",\"delete\"or \"list\" or \"save\" only or type \"exit\" to escape the program");
            }
        }
        scan.close();
    }
}
    

