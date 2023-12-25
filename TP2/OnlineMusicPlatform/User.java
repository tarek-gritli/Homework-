public interface User {
    void listen(Song s);
    void skipSong(Song s);
    void addToPlaylist(Playlist p,Song s);
    void removeFromPlaylist(Playlist p,Song s);
}
