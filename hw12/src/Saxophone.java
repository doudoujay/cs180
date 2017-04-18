/**
 * Created by jay on 2017/4/14.
 */
public class Saxophone extends WoodwindInstrument {
    public Saxophone(String musicianName){
        super(musicianName,WoodwindType.REED);
    }
    @Override
    public void play(String song) {
        System.out.println(this.getMusicianName() + " is playing "+song+" on a saxophone, a "+getType()+" type woodwind.");
    }
}
