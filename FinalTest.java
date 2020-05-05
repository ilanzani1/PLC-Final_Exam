/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltest;
/* @author Ivana */
public class FinalTest {
    public static void main(String[] args) {
    int [][] x = {{1,2,3},{0,0,0},{4,5,6}};
    int rowNum = 0;
    int n = x.length;
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) {
            if (x[i][j] != 0){ 
                break;                
            } else if (j== n-1 && x[i][j] == 0){
                rowNum = i;
                break;
            }
        }
    }
    System.out.println("First all-zero row is: " + (rowNum+1));    
    }
}