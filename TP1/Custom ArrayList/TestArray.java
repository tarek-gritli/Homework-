public class TestArray {

    public static void main(String[] args)
    {
        CustomArrayList arr = new CustomArrayList(25);
        System.out.println("Current size is: "+arr.size());
        if(arr.isEmpty()==true)
        {
            System.out.println("The Array is empty");
        }
        for(int i=0;i<6;i++)
        {
            arr.add(i);
        }
        System.out.println("Current size is: "+arr.size());
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.print("\n");
        arr.add(4,7);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.print("\n");
        if(arr.isIn(7))
        {
            System.out.println(7+" exists in the array and is at index "+arr.find(7));
        }
        else{
            System.out.println("it doesn't exist");
        }
        arr.remove(7);
        System.out.println("After removing 7 the array becomes: ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }

    }
}
