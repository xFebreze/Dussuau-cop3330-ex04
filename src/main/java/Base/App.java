package Base;

import java.util.Scanner;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Alek Dussuau


Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then
construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a
story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges
Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
 */
public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //inputs
        String noun = Read1("noun");
        String verb = Read1("verb");
        String adjective = Read2("adjective");
        String adverb = Read2("adverb");

        //output
        System.out.printf("Do you %s your %s %s %s? That's Hilarious!", verb, adjective, noun, adverb);
    }

    private static String Read1(String x){
        System.out.print("Enter a " + x + ": ");
        String temp = input.nextLine();
        return temp;
    }

    private static String Read2(String x){
        System.out.print("Enter an " + x + ": ");
        String temp = input.nextLine();
        return temp;
    }
}
