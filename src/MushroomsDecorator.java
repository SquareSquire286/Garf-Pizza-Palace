public class MushroomsDecorator extends AbstractDecorator
{
    public MushroomsDecorator(AbstractPizza pizza)
    {
        this.pizza = pizza;
        this.ingredientCount = this.pizza.ingredientCount + 1;
    }
    
    @Override
    public double getPrice()
    {
        return pizza.getPrice() + 0.75; // The additional cost of mushrooms is $0.75.
    }
    
    // Print all ingredients in chronological order (e.g. starting with cheese and tomato sauce, ending with the most recently decorated topping.
    
    @Override
    public void printIngredients()
    {
        pizza.printIngredients(); 
        System.out.print("Mushrooms. ");   
    }
}
