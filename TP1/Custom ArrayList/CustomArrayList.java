public class CustomArrayList
{
    private int[] arr;
    private int size;
    CustomArrayList(){
        arr = new int [10];
    };
    CustomArrayList(int initialSize)
    {
        arr=new int [initialSize];
        size=0;
    }
    public void add (int a)
    {
        if(arr.length==this.size)
        {
            int newLen = arr.length*2;
            int[] newArr = new int[newLen];
            for(int i=0;i<size;i++)
            {
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        arr[size]=a;
        this.size++;
    }
    public void add(int index,int x)
    {
        if(arr.length==this.size)
        {
            int newLen = arr.length*2;
            int[] newArr = new int[newLen];
            for(int i=0;i<this.size;i++)
            {
                newArr[i]=arr[i];
            }
            arr=newArr;
        }
        for(int i=size-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=x;
        size++;
    }
    public int get(int index)
    {
        return arr[index];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean isIn (int x)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x) return true;
        }
        return false;
    }
    public int find(int x)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public void remove(int x)
    {
        int i=find(x);
        if(i!=-1){
            for(int j=i;j<size-1;j++)
            {
                arr[j]=arr[j+1];
            }
            size--;
        }
    }

}