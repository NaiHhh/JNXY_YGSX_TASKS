package third;

import java.util.Arrays;
public class Dichotomy {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7, 9, 4, 6};
        int a = 7;

        // 使用冒泡排序对数组进行排序
        bubbleSort(arr);

        // 使用二分查找法查找数组中是否含有变量a
        boolean containsA = binarySearch(arr, a);

        System.out.println("排序后的数组: " + Arrays.toString(arr));
        System.out.println("数组中是否含有变量a: " + containsA);
        System.out.println("a在数组中的下标为：" + getSubscript(arr, a));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[j]和arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true; // 找到了目标元素
            } else if (arr[mid] < target) {
                low = mid + 1; // 目标元素在右半部分
            } else {
                high = mid - 1; // 目标元素在左半部分
            }
        }

        return false; // 没有找到目标元素
    }

    public static int getSubscript(int[] arr, int target) {
        int flag = 0;
        for (int num : arr) {
            if (num == target) {
                return flag;
            }
            flag++;
        }
        return 0;
    }
}