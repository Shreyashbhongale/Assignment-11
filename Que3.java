import java.util.Scanner;

public class Que3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title,artist;
        double duration;
        System.out.print("Entre the title = ");
        artist = sc.nextLine();
        System.out.print("Entre the artist = ");
        title = sc.nextLine();
        System.out.print("Entre the duration = ");
        duration = sc.nextDouble();
        Song s = new Song(title,artist,duration);
        //System.out.println("Title = " + s.getTitle());
        //System.out.println("artist = "+ s.getArtist()); 
        //System.out.println("duration(in Sec) = "+ s.getDuration() + " "+"Min");
        System.out.println(s);
    }
}
class Song {
   private String title;
   private String artist;
   private double duration;
   
    public Song (String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() {
            return this.title;
    }
    public String getArtist() {
            return this.artist;
    }
    public double getDuration() {
            return this.duration;
    }
    public String toString() {
            return "Song     : "+title+"\nArtist   : "+ artist+ "\nduration : "+duration/60+" min"; 
    }
}
