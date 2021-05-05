public class AlfredoSauceDecorator extends PastaDecorator
{
    public AlfredoSauceDecorator(Pasta pasta)
    {
	this.pasta = pasta;
    }

    @Override
    public double getPrice()
    {
        return pasta.getPrice() + 1.25;   
    }

    @Override
    public String getSupplier()
    {
	return pasta.getSupplier();
    }
}
