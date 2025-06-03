public class ToLowerCase {
    public static String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i <= arr.length; i++) { // Bug: should be i < arr.length
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "HelLoWorLD";
        System.out.println(toLowerCase(s));
    }
}
