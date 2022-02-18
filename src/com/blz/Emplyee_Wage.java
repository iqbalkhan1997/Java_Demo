package com.blz;

import javax.swing.*;

public class Emplyee_Wage {

        public static void main( String args[] )
        {
            int min = 0,max = 1;
            int Present=1,Pay_Per_Hr=20,empHr=0;
            //Generate random double value from o to 1 where 0=Absent 1=Present
            //System.out.println("Random value of type double between "+min+" to "+max+ ":");
            double a = Math.random()*(max-min+1)+min;
            //System.out.println(a);
//Generate random int value from 0 to 1
            //System.out.println("Random value of type int between "+min+" to "+max+ ":");
            // int b = (int)(Math.random()*(max-min+1)+min);
            int ispresent = (int)(a);
            System.out.println(ispresent);
            if(ispresent==Present) {
                System.out.println("Employee is Present");
                empHr=8;
            }
                else {
                System.out.println("Employee is Absent");
                empHr=0;
                }
                int Salary=(int)(Pay_Per_Hr*empHr);
                System.out.println("Wage is "+Salary+"");
            }

        }

