package com.pfelix;

import java.io.*;

public class Client {


     /*The Decorator that we want to write that will add functionalities to java input output
     *is going to be a decorator that converts all uppercase characters to lowercase in the input stream.
     * - The component -> Abstract component is the input stream class
     * - Concrete Components -> file input stream and the byte array input stream
     * - Abstract Decorators -> for all input streams is the filter input stream class
     *  are already defined for us from the java .io package.
     */

    //1- extend filter input stream class and override the read methods
    public static void main(String[] args) {

        int c;
        /*For testing purposes and to make the example simple a String buffer was created,
         *instead of adding a whole new resource folder and adding a new text file.
         *Pass the String as the input stream "String buffer to inputStream"*/
        byte[] bytes = ("Patrick Felix\n" + "aAaBBBcBcDDDD").getBytes();

        try(InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes))){
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
