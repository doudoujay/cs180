/**
 * Created by jay on 2017/4/14.
 */
public abstract class StringInstrument extends Instrument{
    private int numStrings;
    public StringInstrument(String musicianName, int numStrings){
        super(musicianName);
        this.numStrings = numStrings;
    }
    public int getNumStrings(){
        return numStrings;
    }
}
