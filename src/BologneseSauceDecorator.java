public class BologneseSauceDecorator extends PastaDecorator
{
    public BologneseSauceDecorator(Pasta pasta)
    {
	this.pasta = pasta;
    }

    @Override
    public double getPrice()
    {
        return pasta.getPrice() + 1.4;   
    }

    @Override
    public String getSupplier()
    {
	return pasta.getSupplier();
    }
}
