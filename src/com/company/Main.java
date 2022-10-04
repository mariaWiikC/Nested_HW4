package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("1.");
        int repetitions_1 = 7;
        for (int i = 1; i < repetitions_1; i++)
        {
            for (int j = repetitions_1 - i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("2.");

        int max = 6;
        for (int i = 1; i <= 6; i++)
        {
            int j = 1;
            for (; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int l = max; l >= j; l--)
                System.out.print("-");
            System.out.println();
        }
    }
}
