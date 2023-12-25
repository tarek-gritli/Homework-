public class MallardDuck extends Duck implements Flyable,Quackable{
    private Flyable flyingBehavior;
    private Quackable quackingBehavior;
    public MallardDuck(String name,Flyable flyingBehavior,Quackable quackingBehavior)
    {
        super(name);
        this.flyingBehavior=flyingBehavior;
        this.quackingBehavior=quackingBehavior;
    }
    public void quack()
    {
        quackingBehavior.quack();
    }
    public void fly()
    {
        flyingBehavior.fly();
    }
    public void display()
    {
        System.out.println("I am a mallard duck, my name is "+getName());
    }
}
