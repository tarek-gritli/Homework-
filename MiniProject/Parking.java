public class Parking {
    private String name;
    private int available;
    private int capacity;

    public Parking(String name,int capacity, int available) {
        this.capacity=capacity;
        this.available = available;
        this.name=name;
    }
    public String getName(){return name;}
    public int getCapacity(){return capacity;}
    public int getAvailable() {return available;}
    public void setAvailable(int p){available=p;}
    public boolean isFull(){return available==0;}
}