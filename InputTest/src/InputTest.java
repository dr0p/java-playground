import java.util.*;
public class InputTest {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Pobieranie pierwszej porcji danych
		System.out.println("Jak się nazywasz? ");
		String name = in.nextLine();
		
		// Pobieranie drugiej porcji danych
		System.out.println("Ile masz lat? ");
		int age = in.nextInt();
		
		System.out.println("Witaj uzytkowniku " + name + ". W przyszłym roku będziesz mieć " + (age + 1) + " lat.");
	}
}
