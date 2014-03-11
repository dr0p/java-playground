import com.sun.xml.internal.ws.api.pipe.NextAction;

public class ParamTest
{
	public static void main(String[] args)
	{
		
		// Test 1 metody nie mogą modyfikować parametrów liczbowych
		System.out.println("testowanie trippleValue:");
		double percent = 10;
		System.out.println("Przed: percent=" + percent);
		trippleValue(percent);
		System.out.println("Po: percent=" + percent);
		
		// Test 2 metody mogą zmieniać stan parametrów będących obiektami.
		System.out.println("\nTestowanie trippleSalary:");
		Employee harry = new Employee("Grzegorze", 50000);
		System.out.println("Przed: salary=" + harry.getSalary());
		trippleSalary(harry);
		System.out.println("Po: salary=" + harry.getSalary());
		
		
		// Test 3 metody nie mogą dodawać nowych obiektów do parametrów obiektowych
		System.out.println("\nTestowanie swap:");
		Employee a = new Employee("Alicja", 70000);
		Employee b = new Employee("Grzegorz", 60000);
		System.out.println("Przed: a=" + a.getName());
		System.out.println("Przed: b=" + b.getName());
		swap(a,b);
		System.out.println("Po: a=" + a.getName());
		System.out.println("Po: b=" + b.getName());
		
		Employee temp_employee = new Employee(6000);
		System.out.println(temp_employee.getName());
		
	}
	
	public static void trippleValue(double x)
	{
		x = 3*x;
		System.out.println("Koniec metody: x=" + x);
	}
	
	public static void trippleSalary(Employee x)
	{
		x.raiseSalary(200);
		System.out.println("Koniec metody: salary= " + x.getSalary());
	}
	
	public static void swap(Employee x, Employee y)
	{
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("Koniec metody: x=" + x.getName());
		System.out.println("Koniec metody: y=" + y.getName());
		
	}
}


class Employee
{
	private String name;
	private double salary;
	private static int nextId = 1;
	
	public Employee(String n, double s)
	{
		name = n; salary = s;
	}
	
	public Employee(double s)
	{
		this("Employee #" + nextId, s);
		nextId++;
	}
	
	public String getName() { return name; }
	public double getSalary() { return salary; }
	public void raiseSalary(double byPercent) { double raise = salary * byPercent / 100; salary += raise; }
}