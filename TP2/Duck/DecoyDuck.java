public class DecoyDuck extends Duck
{
    private String material;
    public DecoyDuck(String name,String material)
    {
        super(name);
        this.material=material;
    }
    public String getMaterial()
    {
        return material;
    }
    public void display()
    {
        System.out.println("I am a decoy duck, my name is "+getName()+" ,I am made of "+getMaterial());
    }
}
