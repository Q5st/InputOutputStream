package com.company;

import java.io.*;

public class CopyFiles {

    public static void copyFile(File fileIn, File filOut) throws IOException {
        try(InputStream is = new FileInputStream(fileIn);
            OutputStream os = new FileOutputStream(filOut)){
            long copyByte = is.transferTo(os);
            System.out.println(copyByte+" byte copy");
        }
    }

    public static void copyFolder(File folderIn, File folderOut, String extension) throws IOException{
        File[] files = folderIn.listFiles();
        for (File file : files) {
            if(file.isFile()) {
                String name = file.getName();
                String[] nameArr = name.split("[.]");
                if (nameArr[nameArr.length-1].equals(extension)) {
                    File fileOut = new File(folderOut, file.getName());
                    copyFile(file, fileOut);
                }
            }
        }
    }

}
