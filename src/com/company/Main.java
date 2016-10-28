package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in;
        String nam;
        String names [] = new String[1000];
        Scanner name = new Scanner(System.in);
        int count = 0;
        int[] grades = new int[1000];
        while (true){
            System.out.print("Enter the name.");
            nam = name.next();
            System.out.print("Enter the grade.");
            in = input.nextInt();
            if (in == -1 || count == 999)
                break;
            grades[count] = in;
            names[count] = nam;
            count++;
            }
        System.out.print("Ok, you are now done entering stuff. ");
        while(true) {
            System.out.println("What do you want to access?");
            Scanner access = new Scanner(System.in);
            int lum = access.nextInt();
            if(lum < 0 || lum >= count)
                break;
            System.out.println(names[lum] + ": " + grades[lum]);
        }
    }
}
