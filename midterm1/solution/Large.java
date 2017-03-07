import java.util.List;
import java.util.ArrayList;

/**
 * Solution to Q3 of practice exam
 */
public class Large {
    /**
     * Find the indices of the largest element in Array
     * @param list
     * @return
     */
    private int[] indexOfLargest(int[] list) {
        if(list == null) return null;
        if(list.length == 1) return new int[]{list[0]};

        //Find the largest element in array first
        int largest = list[0];
        for(int num : list)
            largest = Math.max(num, largest);

        //Use an ArrayList to store indices of the largest element
        List<Integer> indices = new ArrayList<>();

        for(int i = 0; i < list.length; i++) {
            if(list[i] == largest)
                indices.add(i);
        }

        //Convert the List back to an Array
        int[] result = new int[indices.size()];
        for(int i = 0; i < indices.size(); i++)
            result[i] = indices.get(i);

        return result;
    }
}