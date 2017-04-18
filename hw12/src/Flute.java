/**
 * Created by jay on 2017/4/14.
 */
public class Flute extends WoodwindInstrument {
    public Flute(String musicianName){
        super(musicianName,WoodwindType.FLUTE);
    }
    @Override
    public void play(String song) {
        System.out.println(this.getMusicianName() + " is playing "+song+" on a flute, a "+getType()+" type woodwind.");
    }
}
