import java.util.ArrayList;
public class Artist {
    ArrayList<Album> albumList = new ArrayList<>();
    private String name;
    public Artist(String name)
    {
        this.name=name;
    }
    public String getName(){return name;}
    public void setName(String n){name=n;}
    public void addAlbum(Album a)
    {
        albumList.add(a);
        System.out.println("Album "+a.getTitle()+" was added successfully to "+getName()+"'s list of albums");
    }
    public void removeAlbum(Album a)
    {
        for(Album al:albumList)
        {
            if(a.getTitle()==al.getTitle())
            {
                System.out.println("Album "+a.getTitle()+" was deleted successfully from "+getName()+"'s list of albums");
                albumList.remove(a);
                return;
            }
        }
        System.out.println("Album "+a.getTitle()+" was not found in "+getName()+"'s list of albums");
    }
    public void listAlbums()
    {
        if(albumList.size()==0)
        {
            System.out.println("Album list of  "+getName()+" is empty");
        }
        System.out.println("Albums of "+getName()+" are: ");
        for(Album a:albumList)
        {
            System.out.println(a.getTitle());
        }
    }
}
