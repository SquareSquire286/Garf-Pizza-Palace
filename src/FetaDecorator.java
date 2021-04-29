public class FetaDecorator extends AbstractDecorator
{
    public FetaDecorator(AbstractPizza pizza)
    {
        this.pizza = pizza;
        this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
	public double getPrice()
    {
        return pizza.getPrice() + 0.6; // The additional cost of feta cheese is $0.60.
    }
    
    @Override
	public void printIngredients()
    {
        pizza.printIngredients();
        System.out.print("Feta Cheese. ");   
    }
}