import junit.framework.TestCase;

/**
 * Created by jay on 2017/2/10.
 */
public class MatrixNeighborsTest extends TestCase {
    public void testIsInMatrix() {
        MatrixNeighbors obj = new MatrixNeighbors(3, 3);
        assertEquals(true, obj.isInMatrix(1,1));
        assertEquals(false, obj.isInMatrix(-1,0));

    }
    public void testNeighbors(){
        MatrixNeighbors obj = new MatrixNeighbors(3,3);
        assertEquals("0,1;1,1;1,0;",obj.neighbors(0,0));
        assertEquals("0,1;0,2;1,2;2,2;2,1;2,0;1,0;0,0;",obj.neighbors(1,1));
        assertEquals("1,2;2,1;1,1;",obj.neighbors(2,2));
        assertEquals("cell does not exist",obj.neighbors(3,0));
    }


}
