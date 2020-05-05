/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

/**
 *
 * @author ivana
 */
public class Problem6a {
    public static void main(String[] args) {
    int first = 1, second = 2, third = 5;
    int min = 0, mid = 0, max = 0;
    System.out.println("First = " + first + " Second: " + second + " Third: " + third);
    if (first < second){
        if (first < third){ 
            min = first;
            if (second < third){
                mid = second;
                max = third;
            }
            if (second > third){
                mid = third;
                max = second;
            }  
        } 
        if (first > third) {
            min = third;
            mid = first;
            max = second;    
        }
    }
    if (first > second) {
        if (first < third){
            min = second;
            mid = first;
            max = third;
        } 
        if (first > third) {
            max = first;
            if (second < third){
                min = second;
                mid = third;
            } 
            if (second > third) {
                min = third;
                mid = second;
            }     
        }
    }
    System.out.println("Min: " + min + " Mid: " + mid + " Max: " + max);
    }
}   
