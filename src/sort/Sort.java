package sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] nums = {1,6,3,4,2,1,5,3,7,2};
        for (int i : nums) {
            System.out.print(i + "    ");
        }
        System.out.println();

        shellSort(nums);

        for (int i : nums) {
            System.out.print(i + "    ");
        }
    }
    public static void shellSort(int[] nums) {
        int gap = 1;
        while (gap < nums.length)
            gap = gap * 3 + 1;

        for (; gap > 0; gap /= 3) {
            for (int i = 0; i + gap < nums.length; i++) {
                if (nums[i] > nums[i + gap]) {
                    int tmp = nums[i + gap];
                    int k = i + gap;
                    for (; k - gap >=0 && nums[k - gap] > tmp; k -= gap)
                        nums[k] = nums[k - gap];
                    nums[k] = tmp;
                }
            }
        }
    }
    private static void quickSort(int[] nums, int start, int end) {
        if (start >= end) return;

        int left = start;
        int right = end;
        int num = nums[start];

        while (start < end) {
            while (end > start && nums[end] >= num)
                end--;
            nums[start] = nums[end];

            while (start < end && nums[start] <= num)
                start++;
            nums[end] = nums[start];
        }
        nums[start] = num;

        quickSort(nums, left, start - 1);
        quickSort(nums, start + 1, right);
    }


    private static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) return nums;

        int num = nums.length - 1;
        int[] left = Arrays.copyOfRange(nums, 0, num/2 + 1);
        int[] right = Arrays.copyOfRange(nums, num/2 + 1, nums.length);


        return mergeArray(mergeSort(left), mergeSort(right));
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int[] newArray = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                newArray[k++] = right[j++];
            } else {
                newArray[k++] = left[i++];
            }
        }
        while (i < left.length)
            newArray[k++] = left[i++];
        while (j < right.length)
            newArray[k++] = right[j++];

        return newArray;
    }


    private static void heapSort(int[] nums){
        for (int i = nums.length - 1; i > 0; i--) {
            adjust(nums, i + 1);
            int tmp = nums[0];
            nums[0] = nums[i];
            nums[i] = tmp;
        }
    }
    public static void adjust(int[] nums, int i) {
        int p = i / 2;
        for (; p >=0; p--) {
            if ((p * 2 + 1) >= i) continue;
            int left = p * 2 + 1;
            int right = left + 1 >= i ? left : left + 1;
            int max = nums[left] > nums[right] ? left : right;
            if (nums[max] > nums[p]) {
                int tmp = nums[max];
                nums[max] = nums[p];
                nums[p] = tmp;
            }
        }
    }

    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }


    private static void directInsert(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {

                int tmp  = nums[i];
                int k = i - 1;
                for (; nums[k] > tmp; k--) {
                    nums[k + 1] = nums[k];
                }
                nums[k + 1] = tmp;
            }
        }
    }
}