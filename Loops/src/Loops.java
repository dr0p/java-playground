import java.util.Arrays;
import java.util.Scanner;

public class Loops {
	public static long fib(int n)
	{
		if (n <= 1) return n;
		else return fib(n-1) + fib(n-2);		
	}
	public static void main(String[] args)
	{
		int yourSales = 30000;
		int target = 10000;
		String performance;
		int bonus;
		
		if (yourSales >= 2 * target) {
			performance = "Excellent";
			bonus = 1000;
		}
		else if (yourSales >= 1.5 * target)
		{
			performance = "Fine";
			bonus = 500;
		}
		else if (yourSales >= target)
		{
			performance = "Satisfactory";
			bonus = 100;
		}
		else
		{
			System.out.println("Jesteś zwolniony!");
		}
		
		System.out.println(fib(30));
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Ile pieniędzy potrzebujesz, aby przejść na emeryturę? ");
//		double goal = in.nextDouble();
//		
//		System.out.print("Ile rocznie będziesz wpłacać? ");
//		double payment = in.nextDouble();
//		
//		System.out.print("Stopa proccentowa w %: ");
//		double interestRate = in.nextDouble();
//		
//		double balance = 0;
//		int years = 0;
//		
//		while (balance < goal)
//		{
//			// Dodanie tegorocznych płatności i odsetek
//			balance += payment;
//			double interest = balance * interestRate / 100;
//			balance += interest;
//			years++;
//			System.out.println("W " + years + " roku masz na koncie " + balance);
//		}
//				System.out.println("Możesz przejść na emeryturę za " + years + " lat.");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);			
		}
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("Ile liczb ma być wylosowanych? ");
//		int k = in.nextInt();
//		
//		System.out.print("Jaka jest górna granica przedziału losowanych liczb? ");
//		int n = in.nextInt();
//		
//		int lotteryOdds = 1;
//		for (int i = 1; i <= k; i++)
//			lotteryOdds = lotteryOdds * (n-i+1) / i;			
//		
//		System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia!");
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Select an option (1,2,3,4)");
//		int choice = in.nextInt();
//		
//		switch(choice)
//		{
//		case 1:
//			System.out.println("Wybrano 1");
//			break;
//		case 2:
//			System.out.println("Wybrano 2");
//			break;
//		case 3:
//			System.out.println("Wybrano 3");
//			break;
//		case 4:
//			System.out.println("Wybrano 4");
//			break;
//		default:
//			System.out.println("Nieprawidłowe dane!");
//			break;
//		}
		
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));
		
		int[] smallPrimes;
		smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 };
		
		int[] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12;
		
		int[] coppiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length * 2);
		
		System.out.println(coppiedLuckyNumbers[9]);
		
		
	}
}


