package com.loopassign;

public class Pattern_Looping {
    static void pattern(int n)
    {
        int i, j;
          
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n; j++)
            {
                if (i == 1 || i == n ||
                    j == 1 || j == n)           
                    System.out.print("*");           
                else          
                    System.out.print(" ");           
            }
            System.out.println();
        }
      
    }
      

    public static void main(String args[])
    {
        int r = 8;
        pattern(r);
    }

}
