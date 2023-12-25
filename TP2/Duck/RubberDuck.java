public class RubberDuck extends Duck implements Quackable{
    private String color;
    public RubberDuck(String name,String color)
    {
        super(name);
        this.color=color;
    }
    public String getColor(){return color;}
    public void display()
    {
        System.out.println("I am a rubber duck, my name is "+getName()+".I am "+getColor());
    }
    public void quack()
    {
        System.out.println("Rubber duck quack quack");
    }

}
