package org.example;
import java.text.DecimalFormat;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("###.##");
        double rate, principal, endp;
        int years;
        System.out.println( "Enter the principal:" );
        Scanner input = new Scanner(System.in);
        principal = input.nextDouble();
        System.out.println("Enter the rate of interest:");
        rate = input.nextDouble();
        String rates = String.format("%.2f%%", rate);
        rate = rate / 100.00;
        System.out.println("Enter the number of years:");
        years = input.nextInt();
        endp = principal * (1 + rate*years);
        String end = String.format("$" + (df.format(endp)));
        System.out.println("After " + years + " years at " + rates + ", the investment will be worth " + end + ".");
        
    }
}
