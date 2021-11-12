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

        System.out.println(list);

    }

    public static void main(String[] args) {
        arrWithoutFour(new int[]{1,24,4,5,43,4,2,1,4,8,1,3}, 4);
    }
}
