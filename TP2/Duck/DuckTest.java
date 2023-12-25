public class DuckTest {
    public static void main(String[] args) {
        Fly1 flyingBehavior1 = new Fly1();
        Fly2 flyingBehavior2 = new Fly2();
        Quack1 quackingBehavior1 = new Quack1();
        Quack2 quackingBehavior2 = new Quack2();
        MallardDuck md = new MallardDuck("md", flyingBehavior1,quackingBehavior1);
        md.fly();
        md.quack();
        md.display();
        RedheadDuck rd = new RedheadDuck("rd", flyingBehavior2,quackingBehavior2);
        rd.fly();
        rd.quack();
        rd.display();
        RubberDuck rubber = new RubberDuck("rubber", "yellow");
        rubber.display();
        rubber.quack();
        DecoyDuck dd = new DecoyDuck("dd", "plastic");
        dd.display();
        dd.swim();
    }
}
