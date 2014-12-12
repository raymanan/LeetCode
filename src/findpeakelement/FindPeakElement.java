//A peak element is an element that is greater than its neighbors.
//
//Given an input array where num[i] ¡Ù num[i+1], find a peak element and return its index.
//
//The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
//
//You may imagine that num[-1] = num[n] = -¡Þ.
//
//For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
//Your solution should be in logarithmic complexity.

package findpeakelement;

public class FindPeakElement {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 2,2 };
        System.out.println(findPeakElement(array));
        System.out.println(findPeakElement1(array));
        System.out.println(findPeakElement2(array));
    }

    public static int findPeakElement(int[] num) {
        int index = -1;
        if (num.length == 1) {
            return index;
        }

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                index = i;
            }
        }

        return index;
    }

    public static int findPeakElement1(int[] num) {
        int len = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[len] >= num[i]) {
                continue;
            }
            if (num[len] < num[i]) {
                len = i;
            }
        }
        return len;
    }

    public static int findPeakElement2(int[] num) {
        int size = num.length;
        if (size <= 1)
            return 0;
        for (int i = 0; i < size - 1; i++) {
            if (num[i] > num[i + 1]) {
                return i;
            }
        }
        return size - 1;

    }
}
