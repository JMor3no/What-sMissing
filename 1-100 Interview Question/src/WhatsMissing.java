import java.util.Objects;

public class WhatsMissing {



    public static void main(String[] args) {
        int intArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28
                            , 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50
                            , 51, 52, 53, 54, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71
                            , 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93
                            , 94, 95, 96, 97, 98, 99, 100 };


        for(int t = 0; t < intArray.length; t++ ){
            for (int r = t+1; r < intArray.length; r++){
                if (Objects.equals(intArray[t], intArray[r])){
                    System.out.println("Duplicate number:" + " " + intArray[t]);

                }
            }
        }





        int sum = 0 - 54;

        for(int x = 0; x < intArray.length;  x++ ) {
            sum = sum + intArray[x];
        }
        System.out.println(sum);

        int sum1 = 0;

        for (int z = 1; z <= 100; z++) {
            sum1 = sum1 + z;
        }

        System.out.println(sum1);

        System.out.println("Missing Number:" + " " + (sum1 - sum));











    }
}
