public class Delete {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length - 1];
        int position = 3;
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != position - 1) newArr[j++] = arr[i];
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}