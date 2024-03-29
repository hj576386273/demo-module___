package com.demo.tool.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author huangjian
 * @version 1.0
 * @Description 数据流工具类
 * @date 2018/4/17
 */
public class IOUtils extends org.apache.commons.io.IOUtils {

    /**
     * 根据文件路径创建文件输入流处理 以字节为单位（非 unicode ）
     * @param filepath
     * @return
     */
    public static FileInputStream getFileInputStream(String filepath) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            System.out.println("错误信息:文件不存在");
            e.printStackTrace();
        }
        return fileInputStream;
    }

    /**
     * 根据文件对象创建文件输入流处理 以字节为单位（非 unicode ）
     * @param file
     * @return
     */
    public static FileInputStream getFileInputStream(File file) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("错误信息:文件不存在");
            e.printStackTrace();
        }
        return fileInputStream;
    }

    /**
     * 根据文件对象创建文件输出流处理 以字节为单位（非 unicode ）
     * @param file
     * @param append true:文件以追加方式打开,false:则覆盖原文件的内容
     * @return
     */
    public static FileOutputStream getFileOutputStream(File file, boolean append) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, append);
        } catch (FileNotFoundException e) {
            System.out.println("错误信息:文件不存在");
            e.printStackTrace();
        }
        return fileOutputStream;
    }

    /**
     * 根据文件路径创建文件输出流处理 以字节为单位（非 unicode ）
     * @param filepath
     * @param append true:文件以追加方式打开,false:则覆盖原文件的内容
     * @return
     */
    public static FileOutputStream getFileOutputStream(String filepath, boolean append) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filepath, append);
        } catch (FileNotFoundException e) {
            System.out.println("错误信息:文件不存在");
            e.printStackTrace();
        }
        return fileOutputStream;
    }
}
