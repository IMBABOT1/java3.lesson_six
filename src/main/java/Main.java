import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static void arrWithoutFour(int[] arr, int value){
        int valueCount = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                valueCount++;
            }
        }
        if (valueCount == 0){
            throw new RuntimeException("Array must contains at least one value: " +value);
        }

        for (int i = arr.length - 1; i >= 0  ; i--) {
            if (arr[i] == 4){
                break;
            }else if (arr[i] != 4){
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size() ; i++) {
            result[i] = list.get(i);
        }

        for (int i = 0; i < result.length /2 ; i++) {
            int temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        arrWithoutFour(new int[]{1,24,4,5,43,2,1,8,1}, 4);
    }
}
