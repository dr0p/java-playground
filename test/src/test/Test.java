package test;

import java.util.Scanner;

public class Test {
	enum Rozmiar { MAŁY, ŚREDNI, DUŻY, EKSTRA_DUŻY };
	public static final double CM_PER_INCH = 2.54;
	public static strictfp void main(String[] args) // obliczenia z zachowaniem mniejszej precyzji
	{
		System.out.println("aaa!");
		System.out.println("\uFFFF");	
		int vacationDays = 10;
		System.out.println(vacationDays);
		
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Rozmiar papieru w centumetrach: "
				+ paperWidth * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);
		
		int m = 7;
		int n = 7;
		
		int a = 2 * ++m;
		int b = 2 * n++;
		
		System.out.println(a);
		System.out.println(b);
		
		int x = a < b ? b : a;
		System.out.println("Większa liczba to " + x);
		
		System.out.println(Integer.toBinaryString(--x));
		x = x << 2;
		System.out.println(Integer.toBinaryString(x));
		
		int c = 4;
		double pierwiastek = Math.sqrt(c);
		System.out.println(pierwiastek);
		
		int nn = 123456789;
		float f = nn;
		
		System.out.println(f);
		
		System.out.println( (byte) 300 );
		
		Rozmiar s = Rozmiar.ŚREDNI;
		
		System.out.println(s);
		
		String greeting = "hello";
		System.out.println(greeting.length());
		
		Scanner in = new Scanner(System.in);
		System.out.println("ja się nazywasz? ");
		String name = in.nextLine();
		System.out.println(name);
		System.out.println("Ile masz lat? ");
		int age = in.nextInt();
		System.out.println(age);
	}
}
