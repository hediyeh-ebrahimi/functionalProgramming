package com.tutorial.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/*
*  file => stream
* close fle is important
* .chars
* Pattern.compile
* */
public class FileStream {
    public static void main(String[] args) {
        //File.readFile("F:\\java_tutorial\\functionalPrograming\\src\\test.txt");
        //File.readFile("src/test.txt");
        //File.getListFileTree("");

        String str = "A,B,C";
        str.chars()
                .map(operand -> (char)operand == ',' ? '-': (char)operand)
                .forEach(i -> System.out.print((char)i));

        System.out.println("-----***------");
        Pattern.compile(",")
                .splitAsStream(str)
                .forEach(System.out::print);
    }

    public static class File{
        public static void readFile(String pathFile){
            if(pathFile != null){
                Path path = Paths.get(pathFile);
                if(Files.exists(path)){
//                    try with source
                    try(Stream<String> stringStream = Files.lines(path)) {
                        stringStream.forEach(System.out::println);
                    } catch (IOException e) {
                        System.out.println("Exception for reading file");
                    }
                }else{
                    System.out.println("File not exist");
                }
            }else{
                System.out.println("Path of file not exist");
            }
        }

        public static void getListFileTree(String path){
            if(path != null){
                Path dir = Paths.get(path);
                System.out.println("----dir-----"+dir.toAbsolutePath());
                try(Stream<Path> dircts= Files.walk(dir)){
                    dircts.forEach(System.out::println);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("Path not exist");
            }
        }
    }
}
