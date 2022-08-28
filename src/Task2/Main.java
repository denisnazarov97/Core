package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int[] myArray = {5,6,3,2,5,1,4,9};
        for(int i = 0; i<myArray.length; i++) {
            for (int j = i+1; j<myArray.length; j++) {
                if(myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
