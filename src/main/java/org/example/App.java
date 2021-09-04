/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int num_ppl = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int num_pizza = input.nextInt();

        System.out.print("How slices per pizza? ");
        int slice_per_pizza = input.nextInt();

        int total = num_pizza * slice_per_pizza;
        int slice_per_person = total / num_ppl;
        int leftover = total % num_ppl;

        System.out.printf("%d people with %d pizzas (%d slices)\n", num_ppl, num_pizza, total);
        System.out.printf("Each person gets %d pieces of pizza.\n", slice_per_person);
        System.out.printf("There are %d leftover pieces.", leftover);

    }
}
