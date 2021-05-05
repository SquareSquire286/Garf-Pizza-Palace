/*
    For all intents and purposes, the Pizza class can be treated as a Cheese Pizza, as mozzarella and tomato sauce are on every pizza.
*/

public class Pizza extends AbstractPizza
{
    public Pizza()
    {
        ingredientCount = 2;
    }
  
    @Override
    public double getPrice()
    {
        return 5;   
    }
    
    @Override
    public void printIngredients() // The only default ingredients are mozzarella cheese and tomato sauce.
    {
        System.out.print("Pizza Ingredients: Mozzarella Cheese. Tomato Sauce. ");   
    }
}
