// Josh McGiff - 19250363
public class PlayListSampleDriver {
    public static void main(String[] args) {
        System.out.println("This is Instance A");
        InstanceA();
        System.out.println();
        System.out.println("This is Instance B");
        InstanceB();
    }
    public static void InstanceA(){
        Playlist test = new Playlist("The Best Playlist");
        test.add(new Track("Symphony","Clean Bandit ft. Zara Larsson",2017,213));
        test.add(new Track("Baby","Clean Bandit ft. MARINA",2018,205));
        test.add(new Track("Solo","Clean Bandit ft. Demi Lovato",2018,223));
        test.showList();
        Track t = new Track("Rather Be", "Clean Bandit ft. Jess Glynne");
        test.add("Rockabye", "Clean Bandit ft. Anne-Marie");
        test.add("I Miss You", "Clean Bandit ft. Julia Michaels", 2017, 205);
        test.add("Should've Known Better", "Clean Bandit ft. Anne-Marie", 2018, 215);
        test.add("Mama", "Clean Bandit ft. Ellie Goulding", 2018, 190);
        test.add(t);
        test.add("Symphony","Clean Bandit ft. Zara Larsson",2017,213);
        System.out.println(test);
        test.remove("Symphony");
        System.out.println(test);
        test.playAll(true);
        System.out.println("\n Filtered by artist name:");
        test.playOnly("Clean Bandit ft. Anne-Marie");
        System.out.println("\n Filtered by year of release:");
        test.playOnly(2018);
    }
    public static void InstanceB(){
        Playlist unknownPlaylist = new Playlist();
        System.out.println(unknownPlaylist);
        unknownPlaylist.add(new Track("Handmade Heaven","MARINA",2019,210));
        unknownPlaylist.add(new Track("Baby","MARINA",2018,205));
        unknownPlaylist.add(new Track("Orange Trees","MARINA",2019,208));
        unknownPlaylist.showList();
        Track t = new Track("Karma", "MARINA");
        unknownPlaylist.add("You", "MARINA");
        unknownPlaylist.add("About Love", "MARINA", 2020, 214);
        unknownPlaylist.add(t);
        System.out.println(unknownPlaylist);
        unknownPlaylist.remove("You");
        System.out.println(unknownPlaylist);
        unknownPlaylist.playAll(true);
        System.out.println("\n Filtered by artist name:");
        unknownPlaylist.playOnly("MARINA");
        System.out.println("\n Filtered by year of release:");
        unknownPlaylist.playOnly(2019);
        unknownPlaylist.setName("Favourite Love+Fear Songs by MARINA");
        System.out.println("\n" + unknownPlaylist);
        Playlist unknownPlaylist2 = new Playlist();
        Playlist unknownPlaylist3 = new Playlist();
        unknownPlaylist2.add(new Track("Hallucinate","Dua Lipa",2020,209));
        System.out.println(unknownPlaylist2);
        unknownPlaylist3.add(new Track("Oblivion","Grimes",2012,251));
        System.out.println(unknownPlaylist3);
        System.out.println(unknownPlaylist.getName());
    }
}
