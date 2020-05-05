/******************************************************************************
PLC - Final Exam
Ivana Lanzani
Question 8b
*******************************************************************************/
#include <stdio.h>
int main() {
    int j = -3;
    for(int i = 0; i < 3; i++){
        if(j+2 == 2 || j+2 == 3)
            j--;
        else if(j+2 == 0)
            j += 2;
        else
            j = 0;
        if(j > 0)
            goto end;
        j = 3-i;
        printf(" %d \n", j); //I added this print statement to
    }                        //double check the result.
    end:
    printf("program is finished"); //Printed this statement to have 
}                                  //to label to direct the goto to

