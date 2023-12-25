import java.util.ArrayList;

public class FreeUser implements User{
    private String username;
    private int skippedSongs;
    private int playedSongs;
    ArrayList<Playlist> playlists = new ArrayList<>();
    public FreeUser(String n)
    {
        username=n;
        skippedSongs=0;
        playedSongs=0;
    }
    public String getUserName(){return username;}
    public void setUserName(String n){username=n;}
    public void listen(Song s)
    {
        if(playedSongs%4==0 && playedSongs!=0)
        {
            //This will be as an ad for the online music platform to remind the free user to upgrade his account
            System.out.println("Don't forget to subscribe to the premium version of our platform where you will listen with no ads and interruption");
        }
        s.playSong();
        playedSongs++;
    }
    public void skipSong(Song s)
    {
        //Free users cannot skip more than 6 songs
        if(skippedSongs<=5)
        {
            System.out.println(getUserName()+" skipped "+s.getTitle());
            skippedSongs++;
        }
        else
        {
            System.out.println("You are currently using the free version of the platform, upgrade your account to listen without ads and skip songs infinitely ");
        }
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
