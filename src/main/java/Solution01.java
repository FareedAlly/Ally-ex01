/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fareed Ally
 */

// Print statement asking for name
// Create scanner to obtain string for user's name
// Print statement with user's name

import java.util.Scanner;

public class Solution01
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("What is your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }

}
