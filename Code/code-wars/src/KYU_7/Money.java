package KYU_7;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        if (principal >= desired) {
            return 0; // Return 0 if the principal is already greater than or equal to the desired amount
        } else {
            double current = principal; // Set the current amount to the initial principal
            int years = 0; // Initialize the number of years to 0
            while (current < desired) { // Continue looping until the current amount reaches the desired amount
                double annualInterest = current * interest; // Calculate the annual interest on the current amount
                double annualTax = annualInterest * tax; // Calculate the tax on the annual interest
                current += (annualInterest - annualTax); // Update the current amount by adding the net interest (interest - tax)
                years++; // Increment the number of years
                System.out.println("Current: " + current + "  Year: " + years); // Print the current amount and year for debugging
            }
            return years; // Return the total number of years it took to reach the desired amount
        }
    }


    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100)); // Expected output: 3
        System.out.println(calculateYears(1000, 0.01625, 0.18, 1200)); // Expected output: 14
    }
}

/*
Mr. Scrooge has a sum of money 'P' that he wants to invest. Before he does, he wants to know how many years 'Y' this sum 'P' has to be kept in the bank in order for it to amount to a desired sum of money 'D'.

The sum is kept for 'Y' years in the bank where interest 'I' is paid yearly. After paying taxes 'T' for the year, the new sum is re-invested.

Note on Tax: Only the year's accrued interest is taxed, not the invested principal.

Example:

  Let P be the Principal = 1000.00
  Let I be the Interest Rate = 0.05
  Let T be the Tax Rate = 0.18
  Let D be the Desired Sum = 1100.00


After the 1st Year -->
  P = 1041.00
After the 2nd Year -->
  P = 1083.86
After the 3rd Year -->
  P = 1128.30

Thus, Mr. Scrooge has to wait for 3 years for the initial principal to amount to the desired sum.

Your task is to complete the provided method and return the number of years 'Y' as a whole in order for Mr. Scrooge to reach the desired sum.

Assumption: Assume that the desired principal 'D' is always greater than the initial principal. However, it is best to take into consideration that if the desired principal 'D' is equal to the principal 'P', this should return 0 years.
 */
