/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem8a;
/* @author ivana */
public class Problem8c {

    public static void main(String[] args) {
        int j = -3;
        for (int i = 0; i < 3; i++) {
            if (j+2 == 2 || j+2 == 3) {
                j--;
            } else if (j+2 == 0) {
                j += 2;
            } else {
                j = 0;
            }
            if (j > 0) {
                break;
            }
            j = 3-i;
            System.out.println(" " + j);  //I added this print statement to
                                            //double check the result.      
        }
    }    
}
