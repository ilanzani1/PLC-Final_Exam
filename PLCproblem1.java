/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plcproblem1;

import java.util.Scanner;
import java.util.*;
import java.io.*;

/**
 *
 * @author ivana
 */
public class PLCproblem1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    String[] array = new String[4];
    File file = new File("/Users/ivana/Desktop/file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            int i = 0;
            String line;
            while ((line = br.readLine()) != null) {
                array[i] = line;
                i++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The contents of the file are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println (array[i]);
        }
        System.out.println("This element is a " + lexAnalyzer(array)); 
        //I was only able to make it work for the first element, I don't know what's wrong.
    } 

    public static String lexAnalyzer(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == ('"')) {
                    return "String";
                } else if (array[i].charAt(j) == ('.')) {
                    return "floating point";
                } 
            }
        }
        return "Integer";
    }
}
