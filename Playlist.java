// Josh McGiff - 19250363
import java.util.ArrayList;
import java.util.Collections;
public class Playlist {
    private String playlistName;
    private ArrayList<Track> trackList = new ArrayList<>();
    public static int playlistNumber = 0;

    public Playlist(String givenPlaylistName){ //In Spotify and similar apps, you can create multiple playlists with the same name
       this.playlistName = givenPlaylistName;
    }
    public Playlist(){  //However if you don't provide a name it gives a default name with the current # of default playlist names, to help distinguish between them.
        this.playlistName = "My Playlist " + incrementPlayListNumber();
    }
    private int incrementPlayListNumber(){
        this.playlistNumber++;
        return playlistNumber;
    }
    public void add(String title, String artist){
        this.trackList.add(new Track(title, artist));
    }
    public void add(String title, String artist, int year, int duration){
        this.trackList.add(new Track(title, artist, year, duration));
    }
    public void add(Track t){
        this.trackList.add(t);
    }
    public boolean remove(String title){
        for(int i = trackList.size()-1; i >= 0; i--){
            if(trackList.get(i).getTitle().equalsIgnoreCase(title)){
                trackList.remove(i);
                return true;
            }
        }
        return false;
    }
    public void setName(String name){
        this.playlistName = name;
    }
    public String getName(){
        return this.playlistName;
    }
    public void showList(){
        if(trackList.size() == 0){
            System.out.println("The list is empty");
        }
        for(int i = 0; i < trackList.size(); i++){
            System.out.println(trackList.get(i));
        }
    }
    public void playAll(boolean random){
        ArrayList<Track> temp = trackList;
        if(random == true){
            Collections.shuffle(temp);
        }
        for(int i = 0; i < temp.size(); i++){
            System.out.println("Now playing: " + temp.get(i));
        }
    }
    public void playOnly(String artist){
        for(int i = 0; i < trackList.size(); i++){
            if(trackList.get(i).getArtist().equalsIgnoreCase(artist)){
                System.out.println("Now playing: " + trackList.get(i));
            }
        }
    }
    public void playOnly(int year){
        for(int i = 0; i < trackList.size(); i++){
            if(trackList.get(i).getYear() == year){
                System.out.println("Now playing: " + trackList.get(i));
            }
        }
    }
    public String toString(){
        String temp = "";
        for(int i = 0; i < trackList.size(); i++){
            temp = temp + (i+1) + ")  " + trackList.get(i) + "\n";
        }
        return this.playlistName + "\n" + temp;
    }
}
