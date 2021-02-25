package design.patterns.structural.adapter;

import java.io.RandomAccessFile;

public class FileManagerUtils {
    private RandomAccessFile f;
    public boolean openFile(String fileName) {
        System.out.println("Opening File : " + fileName);
        boolean success = true;
        return success;
    }

    public boolean closeFile(){
        System.out.println("Closing File : " );
        boolean success = true;
        return success;
    }

    public boolean writeToFile(String d, long pos, long amount){
        System.out.println("Writing " + amount + " character from String: "  + d);
        System.out.println(" to pos: " + pos + " in file");
        boolean success = true;
        return success;
    }

    public String readFromFile (long pos, long amount) {
        System.out.println(" Reading: "  + amount + " Char from pos: " + pos + " in file");
        return  new String("Dynamite");
    }
}

