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
        System.out.print(findPeakElement1(new int[] { 1, 2, 3, 1 }));

    }

    public static int findPeakElement(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (i == 0 && num[i] > num[i + 1]) {
                return i;
            }

            if (i == num.length - 1 && num[i] > num[i - 1]) {
                return i;
            }

            if (num[i] > num[i + 1] && num[i] > num[i - 1]) {
                return i;
            }
        }

        return -1;
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
}
