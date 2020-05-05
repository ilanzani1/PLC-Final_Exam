/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6b;

/**
 *
 * @author ivana
 */
public class Problem6b {
    public static void main(String[] args) {
    int first = 1, second = 2, third = 5;
    int min = 0, mid = 0, max = 0;
    System.out.println("First = " + first + " Second: " + second + " Third: " + third);
    if (first < second && first < third){
        min = first;    
        if (second < third){
            mid = second;
            max = third;
        } else {
            mid = third;
            max = second;
        }   
    } else if (first < second && first > third){
            min = third;
            mid = first;
            max = second;    
    } else if (first < third){
        min = second;
        mid = first;
        max = third;
    } else if (second < third){
            max = first;
            min = second;
            mid = third;
    } else {
        min = third;
        mid = second;
    }
    System.out.println("Min: " + min + " Mid: " + mid + " Max: " + max);
    }
} 
