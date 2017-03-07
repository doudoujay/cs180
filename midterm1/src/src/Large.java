/**
 * Created by jay on 2017/2/16.
 */
public class Large {
    public int[] indexOfLargest(int[] list) {
        if (list==null){
            return null;
        }
        int[] result = new int[list.length];
        /*Find largest number*/
        int largest = list[0];
        for (int i = 0; i < list.length; i++) {
            if (largest < list[i]){
                largest = list[i];
            }
        }
        int resultIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[0] == largest){
                result[resultIndex] = i;
                resultIndex++;
            }

        }
        return result;

    }
}
