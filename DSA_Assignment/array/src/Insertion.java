public class Insertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int[] newArr = new int[arr.length + 1];
        int position = 3, value = 4;
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position - 1) newArr[i] = value;
            else newArr[i] = arr[j++];
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
