package com.westos.file.readfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TwoFiles {
    public static void main(String [] args) throws IOException {
        String filepath1 = "resource/a.txt";
        String filepath2 = "resource/b.txt";
        File file1 = new File(filepath1);
        File file2 = new File(filepath2);

        String str1 = FileUtils.readFileToString(file1);
        String str2 = FileUtils.readFileToString(file2);
        String str3 = FileUtils.readFileToString(file1,"utf8");
        String str4 = FileUtils.readFileToString(file2,"gbk");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
