import java.util.ArrayList;
public class Album {
    ArrayList <Song> songList = new ArrayList<>();
    private String title;
    public Album(String title)
    {
        this.title = title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void addSong(Song s)
    {
        songList.add(s);
        System.out.println("Song "+s.getTitle()+" was added successfully to Album "+getTitle());
    }
    public void removeSong(String title) 
    {
        for(Song s:songList)
        {
            if(s.getTitle() == title)
            {
                songList.remove(s);
                System.out.println("song " +title+" removed from album "+getTitle());
                return;
            }
        }
        System.out.println("Song not found in album");
    }
    public void listSongs()
    {
        if(songList.size()==0)
        {
            System.out.println("Album "+getTitle()+" is empty");
            return;
        }
        System.out.println("Songs present in the album are: ");
        for(Song s: songList)
        {
            System.out.println(s.getTitle());
        }
    }

}
