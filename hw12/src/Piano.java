/**
 * Created by jay on 2017/4/14.
 */
public class Piano extends StringInstrument {
    private String key;

    public Piano(String musicianName, int numStrings, String key) {
        super(musicianName, numStrings);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public void play(String song) {
        System.out.println(this.getMusicianName() + " is playing "+song+" on a "+getNumStrings()+" string piano in the key of "+getKey()+".");
    }
    public static void main(String[] args) {
        Instrument piano = new Piano("Sahil Pujari", 280, "C");
        piano.play("Piano Sonata");
    }
}
