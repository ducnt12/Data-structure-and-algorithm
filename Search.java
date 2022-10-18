import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] array = { 2, 1, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.binarySearch(array, 3));
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
