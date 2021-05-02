import java.util.Scanner;
import java.util.InputMismatchException;

public class GarfPizzaPalace
{
    public static void main(String[] args)
    {
	GarfPizzaPalace app = new GarfPizzaPalace();
	Scanner scanner = new Scanner(System.in);
	FacadeInterface facadeInterface = new FacadeInterface();

	System.out.println("");
	System.out.println("*******************************");
	System.out.println("Welcome to Garf's Pizza Palace!");
	System.out.println("*******************************");
	System.out.println("");

	System.out.println("Press [1] to place an order for pizza, or [2] to place an order for pasta.");

	try
	    {
		char choice = scanner.nextLine().charAt(0);
	        facadeInterface.createOrder(choice);

		AbstractPizza pizza = facadeInterface.getPizza();
		System.out.println("");
		pizza.printIngredients();
		System.out.println("");
		System.out.println("Pizza Price: $" + String.format("%.2f", pizza.getPrice()));
		System.out.println("");
	    }
	catch (Exception e)
	    {
		System.out.println("");
		System.out.println("Invalid choice. Exiting program.");
		System.out.println("");
	    }
    }
}
