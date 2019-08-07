package Main;

public class Util {

    public static <T> void printArray(T[] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println("Index " + i + " Value - " + arr[i]);
    }

}
