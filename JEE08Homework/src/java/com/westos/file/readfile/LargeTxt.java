package com.westos.file.readfile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class LargeTxt {

    public static void main(String [] args) throws IOException {
        //太大了不想传_(:з」∠)_  创建文件代码：fsutil file create new resource/c.txt 1073741824
        File file = new File("resource/c.txt");

        //out of memory 自己造卡车可以解决
        String str = FileUtils.readFileToString(file);

        System.out.println(str);
    }
}
