public class RedheadDuck extends Duck implements Quackable,Flyable{
    private Flyable flyingBehavior;
    private Quackable quackingBehavior;
    public RedheadDuck(String name,Flyable flyingBehavior,Quackable quackingBehavior)
    {
        super(name);
        this.flyingBehavior=flyingBehavior;
        this.quackingBehavior=quackingBehavior;
    }
    public void fly()
    {
        flyingBehavior.fly();
    }
    public void quack()
    {
        quackingBehavior.quack();
    }
    public void display()
    {
        System.out.println("I am a redhead duck, my name is "+getName());
    }
}
