import java.util.ArrayList;

public class PremiumUser implements User {
    private String username;
    ArrayList<Playlist> playlists = new ArrayList<>();
    public PremiumUser(String n)
    {
        username=n;
    }
    public String getUserName(){return username;}
    public void setUserName(String n){username=n;}
    public void listen(Song s)
    {
        s.playSong();
    }
    public void skipSong(Song s)
    {
        System.out.println(getUserName()+" skipped "+s.getTitle());
    }
    public void addToPlaylist(Playlist p,Song s)
    {
        if(playlists.contains(p))
        {
            p.addSong(s);
        }
        else{
            System.out.println("Playlist "+p.getTitle()+" not found");
        }
        
    }
    public void removeFromPlaylist(Playlist p,Song s)
    {
        if(playlists.contains(p))
        {
            if(p.playlist.contains(s))
            {
                p.removeSong(s);
                return;
            }
        }
        else System.out.println("No playlist matching that title found");
    }
}
