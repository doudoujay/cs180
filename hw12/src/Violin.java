/**
 * Created by jay on 2017/4/14.
 */
public class Violin extends StringInstrument {
    public Violin(String musicianName) {
        super(musicianName, 4);
    }

    @Override
    public void play(String song) {
        System.out.println(this.getMusicianName() + " is playing "+song+" on a "+getNumStrings()+" string violin.");
    }
    public static void main(String[] args) {
        Instrument violin = new Violin("Tori Shurman");
        violin.play("Violin Song");
    }
}
