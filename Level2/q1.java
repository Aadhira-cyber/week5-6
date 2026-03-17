import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] empData = new double[10][2];
        double[][] results = new double[10][2];  
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("  Enter Salary: ");
            double salary = sc.nextDouble();
            System.out.print("  Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("  Invalid input. Please enter valid positive numbers.");
                i--; 
                continue;
            }

            empData[i][0] = salary;
            empData[i][1] = years;
        }

        for (int i = 0; i < 10; i++) {
            double currentSalary = empData[i][0];
            double yearsOfService = empData[i][1];
            double bonusRate = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = currentSalary * bonusRate;
            double newSalary = currentSalary + bonusAmount;
            results[i][1] = bonusAmount;
            results[i][0] = newSalary;
            totalOldSalary += currentSalary;
            totalBonus += bonusAmount;
            totalNewSalary += newSalary;
        }

        System.out.println("\n--- Zara Payroll Summary Report ---");
        System.out.printf("Total Old Salary:   $%,.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: $%,.2f\n", totalBonus);
        System.out.printf("Total New Salary:   $%,.2f\n", totalNewSalary);
        
        sc.close();
    }
}
