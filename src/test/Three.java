package test;

public class Three {
    public static void main(String[] args) {
        /*String pa = "([a-z]){3,}";
        String $1$1 = "leeetcode".replaceAll(pa, "$1$1");
        System.out.println($1$1);*/
        String s = "aab";
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length - 1; i++) {

            int j = 1;
            while(i < chars.length - 1 && chars[i] == chars[i + 1]) {
                i++;
                j++;
            }
            if (j >= 2) {
                sb.append(chars[i]);
            }
            sb.append(chars[i]);
        }
        if (chars[chars.length - 1] != chars[chars.length - 2])
            sb.append(chars[chars.length - 1]);
        String s1 = sb.toString();
        System.out.println(s1);

    }
}
