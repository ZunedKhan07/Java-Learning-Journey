// divide the array into two halves
// sort the two halves individually using recursion  ---> (subproblem)
// merge the two sorted halves  --> (self problem)
// Time Complexity: O(n*log n)
// space complexity: O(n)
// merge sort stable sorting algorithm hai
// merge sort is a in-place nhi hai
// merge sort recursive algorithm hai
// merge sort every time base case ya worstcase me bhi O(n log n) hi leta hai


public class MergeSort {

    public static void merge(int arr[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // left aur right arrays fill karo
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;

        // dono arrays compare karke merge karna
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // agar left me elements bache ho
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // agar right me elements bache ho
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);      // left half
        mergeSort(arr, mid + 1, r);  // right half
        merge(arr, l, mid, r);       // merge both halves
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 3, 1, 0};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}