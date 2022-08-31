package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try{
            FileReader file = new FileReader(args[0]);//①
            BufferedReader buff = new BufferedReader(file);
            FileWriter writer = new FileWriter(args[1]);//②
            String text;
            while ((text = buff.readLine()) != null) {
                System.out.println(text);
                writer.write(text);
                writer.write("\r\n");//③
            }
            file.close();//④
            writer.close();
        }catch(FileNotFoundException fnoe){//⑤
            fnoe.printStackTrace();
        }catch(IOException ioe){ //⑥
            ioe.printStackTrace();
        }
    }
}
