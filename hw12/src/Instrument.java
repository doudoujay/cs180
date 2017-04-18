/**
 * Created by jay on 2017/4/14.
 */
public abstract class Instrument {
    private String musicianName;

    public Instrument(String musicianName) {
        this.musicianName = musicianName;
    }
    public String getMusicianName(){
        return this.musicianName;
    }
    public abstract void play(String song);
}
