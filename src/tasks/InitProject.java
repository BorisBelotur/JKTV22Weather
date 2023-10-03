/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class InitProject {
    public void init() {
        int[][] temp = new int[12][];
        temp[0]= new int[31];
        temp[1]= new int[28];
        temp[2]= new int[31];
        temp[3]= new int[30];
        temp[4]= new int[31];
        temp[5]= new int[30];
        temp[6]= new int[31];
        temp[7]= new int[31];
        temp[8]= new int[30];
        temp[9]= new int[31];
        temp[10]= new int[30];
        temp[11]= new int[31];
        int max = 40;
        int min = -30;
        Random random = new Random();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = random.nextInt(max-min +1)- min;
                
            }
            
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.printf("%4d",temp[i][j]);
                
            }
            System.out.println();
            
        }
        
        
    }
    
}
