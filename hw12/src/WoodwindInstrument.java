/**
 * Created by jay on 2017/4/14.
 */
public abstract class WoodwindInstrument extends Instrument {

    private WoodwindType type;
    public WoodwindInstrument(String musicianName, WoodwindType type){
        super(musicianName);
        this.type = type;
    }
    public String getType(){
        if(type.equals(WoodwindType.FLUTE)) return "FLUTE";
        if(type.equals(WoodwindType.REED)) return "REED";
        return null;
    }
}
