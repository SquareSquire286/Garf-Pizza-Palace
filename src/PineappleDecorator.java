public class PineappleDecorator extends AbstractDecorator
{
    public PineappleDecorator(AbstractPizza pizza)
    {
        this.pizza = pizza;
        this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
    public double getPrice()
    {
        return pizza.getPrice() + 0.8; // The additional cost of pineapple is $0.80.
    }
    
    @Override
    public void printIngredients()
    {
        pizza.printIngredients();
        System.out.print("Pineapple. ");   
    }
}
