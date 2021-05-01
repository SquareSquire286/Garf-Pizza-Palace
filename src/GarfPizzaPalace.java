import java.util.Scanner;
import java.util.InputMismatchException;

public class GarfPizzaPalace
{
    public PastaFactory pastaFactory;

    public GarfPizzaPalace()
    {
	pastaFactory = new PastaFactory();
    }

    public void createOrder(int choice)
    {
	if (choice == 1)
	    this.createPizzaOrder();

	else if (choice == 2)
	    this.createPastaOrder();

	else System.out.println("Invalid choice. Exiting program.");
    }

    public void createPizzaOrder()
    {
	System.out.println("Pizza Module Coming Soon");
    }

    public void createPastaOrder()
    {
	System.out.println("Pasta Module Coming Soon");
    }

    public static void main(String[] args)
    {
	GarfPizzaPalace app = new GarfPizzaPalace();
	Scanner scanner = new Scanner(System.in);

	System.out.println("*******************************");
	System.out.println("Welcome to Garf's Pizza Palace!");
	System.out.println("*******************************");
	System.out.println("");

	System.out.println("Press [1] to place an order for pizza, or [2] to place an order for pasta.");

	try
	    {
		int choice = scanner.nextInt();
	        app.createOrder(choice);
	    }
	catch (Exception e)
	    {
		System.out.println("Invalid choice. Exiting program.");
	    }
    }
}
