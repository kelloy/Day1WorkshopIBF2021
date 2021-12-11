package shoppingcart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class loginhandle {

    public String createDirectory() {
        System.out.println("specify folder for cart if not just enter default");
        Scanner scan = new Scanner(System.in);
        String directory = scan.next();
        Path path = null;
        if("default".equals(directory)){
            path = Paths.get("cart.db");
            System.out.println("default folder \"cart.db\" chosen");
        }else{
            try{
                path =  Paths.get(directory);
                Files.createDirectory(path);
                System.out.println("Directory Created!");
                } catch (IOException e){
                    System.out.println("Failed to create directory"+e.getMessage());
                }
        }
        return path.toString();
    }

    public String checkFile(String dirpath) throws IOException{
        System.out.println("type login user name");
        String command="";
        String argument;
        String filepath = "";
        
        while(!"exit".equals(command)){
            Scanner scan = new Scanner(System.in);
            command = scan.next();
            argument = scan.next();

            if("login".equals(command)){
                File f = new File(dirpath+"\\"+argument+".txt");
                if(f.createNewFile()==true){
                System.out.println("no such user new file will be created");
                filepath = f.toString();
                break;   
                }else
                System.out.println("Welcome back "+argument);
                filepath = f.toString();
                break;
            }
            else if("save".equals(command))
            System.out.println("you have to login to access the file");
            else
            System.out.println("Please login or type exit");
        }
        return filepath;
    }


    public static List<String> readfile(String filepath) throws IOException {
        List<String> list = new ArrayList<>();
        String line;
        try (Reader reader = new FileReader(filepath)){
            BufferedReader br = new BufferedReader(reader);
            while(null != (line = br.readLine()))
            list.add(line+"\n");
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return list;
    }

    public void save(String filepath, List<String> list) throws IOException {
        try(FileWriter fw = new FileWriter(filepath)){
            BufferedWriter bw = new BufferedWriter(fw);
            for(String item:list){
                bw.write(item+"\n");
            }
            bw.close();
        }
        
    }


    public void userlist(File folder) throws IOException{
        String user;
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                userlist(fileEntry);
            } else {
                user = fileEntry.getName();
                user = user.substring(0, (user.lastIndexOf(".")));
                System.out.println(user);
            }
        }
    }
}
    
