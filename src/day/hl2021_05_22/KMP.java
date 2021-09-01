package day.hl2021_05_22;

/**
 * @author hl2333
 */
public class KMP {
    public static void main(String[] args) {
        String s1 = "ababcabcacbab";
        String s2 = "abcac";

        int index = find(s1, s2);
        System.out.println(index);
    }

    private static int find(String s1, String s2) {
        int j = 0;
        int[] next = new int[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            while (s1.charAt(i) != s2.charAt(j)) {
                i++;
                j++;
            }

        }
        return -1;
    }
}
