import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class LeetCode {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74, 18, 60, 61, 35, 83, 13, 56, 75,
                52, 70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24, 69, 2, 30, 61, 83, 37, 97, 16, 70, 53, 0, 61, 12, 17,
                97, 67, 33, 30, 49, 70, 11, 40, 67, 94, 84, 60, 35, 58, 19, 81, 16, 14, 68, 46, 42, 81, 75, 87, 13, 84,
                33, 34, 14, 96, 7, 59, 17, 98, 79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80, 78, 80, 6, 5, 24, 49,
                82);

        System.out.println(countingSort(nums));
    }

    // Check if ransomNote can be constructed by characters from magazine
    private static boolean canConstructed(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>(26);

        for (int i = 0; i < magazine.length(); i++) {
            char character = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(character, 0);
            magazineLetters.put(character, currentCount + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char character = ransomNote.charAt(i);
            int currentCount = magazineLetters.getOrDefault(character, 0);
            if (currentCount == 0) {
                return false;
            } else {
                magazineLetters.put(character, currentCount - 1);
            }
        }

        return true;
    }

    private static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        if (newStr.equals(str)) {
            return true;
        }

        return false;
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String string : strs) {
            while (string.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    private static void miniMaxSum(List<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        long sum = 0;
        long minSum = 0;
        long maxSum = 0;
        for (int integer : arr) {
            min = Math.min(integer, min);
            max = Math.max(integer, max);
            sum += integer;
        }

        minSum = sum - max;
        maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }

    private static String timeConversion(String s) {
        // Write your code here
        String time = s.substring(0, s.length() - 2);
        String result = "";
        String[] timeArr = time.split(":");
        if (s.contains("PM")) {
            if (!timeArr[0].equals("12")) {
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0]) + 12);
            }
        } else {
            if (timeArr[0].equals("12")) {
                timeArr[0] = "00";
            }
        }
        for (String string : timeArr) {
            result += (string + ":");
        }

        return result.substring(0, result.length() - 1);
    }

    private static int lonelyinteger(List<Integer> a) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int integer : a) {
            int currCount = map.getOrDefault(integer, 0);
            map.put(integer, currCount + 1);
        }

        for (int integer : a) {
            if (map.get(integer) == 1) {
                return integer;
            }
        }

        return -1;
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        LinkedList<Integer> result = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            result.add(0);
        }

        for (int integer : arr) {
            int currCount = result.get(integer);
            result.remove(integer);
            result.add(integer, currCount + 1);
        }

        return result;
    }
}
