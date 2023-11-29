package week_7_Switch_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
  /*  . SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                3.4.1 salary
                3.4.2 stateTax
                3.4.3 federalTax
                3.4.4 totalTax
                3.4.5 netIncome
   */
  public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println("What's your hourly rate?");
      double hourlyRate=input.nextDouble();
      System.out.println("How many hours are you  working in a week?");
      int hoursWeek=input.nextInt();
      System.out.println("What is the state tax?");
      double stateTax=input.nextDouble();
      System.out.println("What is the federal tax?");
      double federalTax=input.nextDouble();

      double salary, totalTax,netIncome;
      salary=hourlyRate*hoursWeek;
      totalTax=stateTax*federalTax;
      netIncome=salary-totalTax;
      System.out.println("Salary : "+netIncome+" $");

  }
}
