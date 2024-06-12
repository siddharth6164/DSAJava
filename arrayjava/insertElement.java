public class insertElement {
    static int insertElementLast(int arr[], int n, int key, int capacity) {
        if (n >= capacity) {
            return n;
        }
        arr[n] = key;
        return (n + 1);
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 13;
        arr[3] = 14;
        arr[4] = 15;
        arr[5] = 16;

        int capacity = arr.length;
        int n = 6;
        int key = 17;

        n = insertElementLast(arr, n, key, capacity);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// input--> {1,2,3,4,5,6}
// output-->{1,2,3,4,5,6,26}