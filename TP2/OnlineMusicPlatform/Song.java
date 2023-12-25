public class Song{
    private int songLength,releaseYear;
    private String genre,title;
    public Song(String title,int songLength,int releaseYear,String genre)
    {
        this.title = title;
        this.songLength = songLength;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }
    public int getSongLength()
    {
        return songLength;
    }
    public int getYear()
    {
        return releaseYear;
    }
    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setSongLength(int l)
    {
        songLength = l;
    }
    public void setYear(int year)
    {
        releaseYear = year;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setGenre(String g)
    {
        genre = g;
    }
    public void playSong()
    {
        System.out.println("Playing song: "+getTitle());
    }

}