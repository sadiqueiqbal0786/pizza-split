package com.epam.rd.autotasks.pizzasplit;
import java.util.Scanner;
public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int mn=scanner.nextInt();
        int pz=scanner.nextInt();
        int r=pz;
        int count=0;
        if(mn!=pz){
            while (r%mn!=0){
                count ++;
                r+=pz;
            }
            System.out.print(count+1);
        }
        else {
            System.out.print(1);
        }


    }}