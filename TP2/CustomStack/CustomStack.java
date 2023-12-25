public class CustomStack {
    private int capacity;
    private int size;
    private int[] s;
    public CustomStack(int capacity)
    {
        size=0;
        this.capacity=capacity;
        s=new int[capacity];
    }
    public void addElement(int x)
    {
        if(size<capacity)
        {
            s[size]=x;
            size++;
        }
        else
        {
            System.out.println("error.stack is full");
        }
    }
    public void removeElement()
    {
        if(size==0)
        {
            System.out.println("stack is empty");
        }
        else
        {
            size--;
        }
    }
    public int lastInStack()
    {
        if(size==0)
        {
            return -1;
        }
        else
        {
            return s[size-1];
        }
    }
    public boolean stackIsEmpty()
    {
        return size==0;
    }
    public boolean stackIsFull()
    {
        return size==capacity;
    }

}