public class PastaFactory
{
    public Pasta createPasta(int choice)
    {
        switch (choice)
        {
            case 1: return new Spaghetti();
            case 2: return new Fettucine();
            case 3: return new Linguine();
            case 4: return new Penne();
            case 5: return new Lasagna();
            default: return null;
        }
    }
}
