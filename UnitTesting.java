/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unisttesting;

/**
 *
 * @author user
 */
public class UnistTesting {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    public int sum(int a, int b){
        return a+b;
    }
       public int subs(int a, int b){
        return a-b;
        }
            public int multi(int a, int b){
        return a*b;
            }
            public int divi(int a, int b){
        return a/b;
            }
         public int calculateSalary(int workingHour , boolean weekday){
             if(weekday ==false) return workingHour*200;
             else if (workingHour>48) return workingHour*150;
             else return workingHour*100;
             
             
         }
         


    public static final int PROBATION = 1;   
    public static final int SCHOLARSHIP = 2; 
    public static final int GOOD_STANDING = 0; 

    public int CGPAtest(int ID, float CGPA) {
        if (CGPA < 2.15) {
            return PROBATION; // Below 2.15, on probation
        }
        else if (CGPA < 2.4) {
            return PROBATION; // Between 2.15 and 2.4, on probation
        }
        else if (CGPA > 3.5) {
            return SCHOLARSHIP; // Above 3.5, eligible for scholarship
        }
        else {
            return GOOD_STANDING; // Between 2.4 and 3.5, in good standing
        }
    }
}
