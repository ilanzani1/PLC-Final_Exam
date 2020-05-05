/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;

/**
 *
 * @author ivana
 */
public class Problem6 {
    public static void main(String[] args) {
    int a = 2, b = 5, c = 9;
    int min, mid, max;
    if (a < b){
        if (a < c){
            min = a;
            if (b < c){
                mid = b;
                max = c;
                } else {
                    mid = c;
                    max = b;
                }   
        }
    } else {
        if (a < c){
            min = b;
            mid = a;
            max = c;
        } else {
            max = a;
            if (b < c){
                min = b;
                mid = c;
            } else {
                min = c;
                mid = b;
            }     
            
            
            }
        }
    System.out.println("Min: " + a + "Mid: " + b + "Max: " + c);
    }
}    
    
