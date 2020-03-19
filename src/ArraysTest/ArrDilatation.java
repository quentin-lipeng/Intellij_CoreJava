package ArraysTest;

public class ArrDilatation {
    public static void main(String[] args) {
        int arrLength = -1;
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        for (int i : arr){
            System.out.println(i);
        }
        arrLength = arr.length;
        System.out.println("arrLength = " + arrLength);

        int[] arr1 = new int[arr.length*2];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        for (int i : arr1){
            System.out.println(i);
        }
        arrLength = arr1.length;
        System.out.println("arrLengthAfter = " + arrLength);
    }
}
