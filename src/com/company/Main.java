package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File folderIn = new File("C:\\Users\\user\\Downloads\\Telegram Desktop");

        File folderOut = new File(folderIn.getName());
        folderOut.mkdirs();

        try {
            CopyFiles.copyFolder(folderIn, folderOut, "JPG");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
