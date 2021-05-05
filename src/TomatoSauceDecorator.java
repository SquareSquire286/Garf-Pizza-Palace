public class TomatoSauceDecorator extends PastaDecorator
{
    public TomatoSauceDecorator(Pasta pasta)
    {
	this.pasta = pasta;
    }

    @Override
    public double getPrice()
    {
        return pasta.getPrice() + 1;   
    }

    @Override
    public String getSupplier()
    {
	return pasta.getSupplier();
    }
}
