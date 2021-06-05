/*
The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.
Example Output
What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.

Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */


package programming1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int p= in.nextInt();

        System.out.print("What is the rate? ");
        double r=in.nextDouble();

        System.out.print("What is the number of years? ");
        int y= in.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n= in.nextInt();

        //A = P(1 + r/n)^(n*t)
        //double A =Math.pow(((1 + r/n)),(n*y))*p;
        double A = p * Math.pow(1 + ((r/100) / n), n * y);;


        double rownd=Math.round(A*100)/100.0;

        String out="$"+p+ " invested at "+r+"% for "+y+ " years compounded "+n +" times per year is $"+rownd+".";
        System.out.println(out);
    }
}