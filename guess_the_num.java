package com.company;

import java.util.*;

class game{
    int num,input,count;
    int takeinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        input = sc.nextInt();
        return input;
    }
    int random(){
        Random r = new Random();
        this.num = r.nextInt(100);
        return this.num;
    }
    boolean game(int num, int input){
        count++;
        if(num==input){
            System.out.printf("\nYou guessed it right in %d attempts",count);
            return true;
        }
        else if(num<input){
            System.out.println("Too high...\n");
        }
        else if(num>input){
            System.out.println("Too low...\n");
        }
        return false;
    }
}

public class guess_the_num {

    public static void main(String[] args) {
        game g = new game();
        System.out.println("Enter the number between 1 to 100");
        int r=g.random();
        boolean b=false;
        try {
            while (b == false) {
                int k = g.takeinput();
                b = g.game(r, k);
            }
        }
        catch(Exception e){
            System.out.println("Sorry you cannot proceed further because of the Exception:");
            System.out.println(e);
        }
    }
}
