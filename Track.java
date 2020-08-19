// Josh McGiff - 19250363
public class Track implements Comparable<Track>{

    private String trackName;
    private String artistName;
    private int trackYear = 0;
    private int trackDuration = 0;

    public Track(String givenTrackName, String givenArtistName){
        this.trackName = givenTrackName;
        this.artistName = givenArtistName;
    }
    public Track(String givenTrackName, String givenArtistName, int givenTrackYear, int givenTrackDuration){
        this.trackName = givenTrackName;
        this.artistName = givenArtistName;
        this.trackYear = givenTrackYear;
        this.trackDuration = givenTrackDuration;
    }
    public void setTitle(String title){
        this.trackName = title;
    }
    public String getTitle(){
        return this.trackName;
    }
    public void setArtist(String artist){
        this.artistName = artist;
    }
    public String getArtist(){
        return this.artistName;
    }
    public void setYear(int year){
        this.trackYear = year;
    }
    public int getYear(){
        return this.trackYear;
    }
    public void setDuration(int duration){
        this.trackDuration = duration;
    }
    public int getDuration(){
        return this.trackDuration;
    }
    public String toString(){
        return this.trackName + " --- " + this.artistName + " --- " + this.trackYear + " --- " + (this.trackDuration/60) + ":" + (this.trackDuration%60);
    }
    public int compareTo(Track given){
        return this.trackName.toUpperCase().compareTo(given.trackName.toUpperCase());
    }
}
