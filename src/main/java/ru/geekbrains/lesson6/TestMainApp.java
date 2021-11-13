package ru.geekbrains.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMainApp {

    public int[] arrWithoutFour(int[] arr){
        int value = 4;
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

        return result;

    }


    public boolean checkNumbers(int[] arr){
        int oneCount = 0;
        int fourCount = 0;
        int result = 0;


        for (int i = 0; i < arr.length ; i++) {
          if (arr[i] == 1){
              oneCount++;
          }else if (arr[i] == 4){
              fourCount++;
          }
        }

        result = oneCount + fourCount;

        if (result < 1){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        //System.out.println(Arrays.toString(arrWithoutFour(new int[]{1,24,4,5,43,2,1,8,1})));

      //  System.out.println(checkNumbers(new int[]{22, 8, 3, 123, 547, 2, 123, 4}));
    }
}
