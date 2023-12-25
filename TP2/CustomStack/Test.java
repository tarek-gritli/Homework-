public class Test {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);
        if(stack.stackIsEmpty()){
            System.out.println("stack is empty");
        }
        stack.addElement(1);
        stack.addElement(2);
        stack.addElement(3);
        stack.addElement(4);
        System.out.println(stack.stackIsFull());
        if(stack.stackIsFull()){
            System.out.println("stack is full");
        }
    }
}
