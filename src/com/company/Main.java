package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = 0;
        int count = 0;
        String list = "";
        while (in != -1){
            in = input.nextInt();
            list = list + " " + in;
            count++;
            int[] temp = new int[count];
            temp[count - 1] = in;
            if(in == -1) {
                int[] grades = temp;
                double average = 0;
                for (int x = 0; x < grades.length; x++)
                    average += grades[x];
                average = average / grades.length;
                System.out.println(average);
            }
        }
}
}
