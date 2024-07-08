import java.util.Scanner;

public class Telephone {
    public static void main(String[] args) {
        Phone phone = new Phone("Purple","Iphone","1TB","3",1200);
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int month = 0;

        System.out.print("Enter your monthly salary: ");
        int monthlySalary = scanner.nextInt();
        System.out.print("Enter your monthly expenses: ");
        int monthlyExpenses = scanner.nextInt();
        int monthlySum = monthlySalary - monthlyExpenses;

        if(monthlySum >= phone.price){
            System.out.println("You can buy iphone in a month");
        } else if (monthlySum < phone.price) {
            for (int i = monthlySalary - monthlyExpenses; i <= phone.price; i++) {
                sum += monthlySum;
                month++;
                if(sum == phone.price){
                    break;
                }
            }
            System.out.println("You can buy an iphone in " + month + " months");
        }

    }
}
