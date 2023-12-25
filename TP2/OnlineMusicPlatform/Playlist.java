import java.util.ArrayList;
import java.util.Collections;
public class Playlist {
    ArrayList<Song> playlist = new ArrayList<>();
    private String playlistTitle;
    private User user;
    public Playlist(User user,String playlistTitle)
    {
        this.user=user;
        this.playlistTitle=playlistTitle;
    }
    public String getTitle(){return playlistTitle;}
    public void addSong(Song s)
    {
        System.out.println("Song "+s.getTitle()+" was successfully added to the playlist "+getTitle());
        playlist.add(s);
    }
    public void removeSong(Song s)
    {
        for(Song song:playlist)
        {
            if(s.getTitle() == song.getTitle())
            {
                playlist.remove(s);
                System.out.println("song " +s.getTitle()+" removed from playlist "+getTitle());
                return;
            }
        }
        System.out.println("Song not found in playlist");
    }
    public void shuffleSongs()
    {
        Collections.shuffle(playlist);
    }
    public void showPlaylist()
    {
        if(playlist.size()==0)
        {
            System.out.println("playlist "+getTitle()+" is empty");
        }
        System.out.println("Songs present in playlist "+getTitle()+" :");
        for(Song s:playlist)
        {
            System.out.println(s.getTitle());
        }
    }
}
