package test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        test10();
        new PriorityQueue(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    private static void test10() {
//        System.out.println("".equals(null));
        int a = Integer.MAX_VALUE;
//        int a = Integer.MAX_VALUE;
//        int b = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
//        Integer.MIN_VALUE
        System.out.println(a + b);
//        int c = (a + b) % 2147483646;
//        System.out.println(c);
    }

    private static boolean test9() {
        String s = "1.0E-23";

        HashMap<Character, Integer>[] map = new HashMap[9];
        map[0] = new HashMap<>(8){{put(' ', 0); put('s', 1); put('d', 2); put('.', 4);}};
        map[1] = new HashMap<>(4){{put('d', 2); put('.', 4);}};
        map[2] = new HashMap<>(8){{put('d', 2); put('.', 3); put('e', 5); put(' ', 8); }};
        map[3] = new HashMap<>(4){{put('e', 5); put('d', 3); put(' ', 8);}};
        map[4] = new HashMap<>(4){{put('d', 3);}};
        map[5] = new HashMap<>(4){{put('s', 6); put('d', 7);}};
        map[6] = new HashMap<>(4){{put('d', 7);}};
        map[7] = new HashMap<>(4){{put('d', 7); put(' ', 8);}};
        map[8] = new HashMap<>(4){{put(' ', 8);}};

        int pos = 0;
        char t;
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == ' ' || tmp == '.') t = tmp;
            else if (tmp == '+' || tmp == '-') t = 's';
            else if (tmp == 'e' || tmp == 'E') t = 'e';
            else if (tmp >= '0' && tmp <= '9') t = 'd';
            else t = '?';

            if (!map[pos].containsKey(t)) return false;
            pos = map[pos].get(t);
        }
        return pos == 2 || pos == 3 || pos == 7 || pos == 8;
    }

    private static int nums = 0;
    private static void test8() {
        int m = 1;
        int n = 2;
        int[][] matrix = new int[1][2];
        matrix[0][0] = 1;
        find8(matrix, 0, 1);

    }
    private static void find8(int[][] m, int i, int j) {
        if (i == m.length && j == m[0].length) {
            nums++;
            return;
        }
        if (i == 0 && j < m[0].length) {
            switch (m[i][j - 1]) {
                case 1 : m[i][j] = 2; find8(m, i, j + 1);
                        m[i][j] = 3; find8(m, i, j + 1);break;
                case 2 : m[i][j] = 1; find8(m, i, j + 1);
                        m[i][j] = 3; find8(m, i, j + 1);break;
                case 3 : m[i][j] = 1; find8(m, i, j + 1);
                        m[i][j] = 2; find8(m, i, j + 1);break;
            }
        }
        if (j == 0) {
            switch (m[i - 1][j]) {
                case 1 : m[i][j] = 2; find8(m, i + 1, j);
                    m[i][j] = 3; find8(m, i + 1, j + 1);break;
                case 2 : m[i][j] = 1; find8(m, i, j + 1);
                    m[i][j] = 3; find8(m, i + 1, j + 1);break;
                case 3 : m[i][j] = 1; find8(m, i, j + 1);
                    m[i][j] = 2; find8(m, i + 1, j + 1);break;
            }
        }
        if (m[i - 1][j] == 1 && m[i][j - 1] == 1) {

        }
    }

    private static void test7() {
        String s = "bbcbaba";
        String pattern = "[a-z](1).\1";
        Pattern compile = Pattern.compile(pattern);
        Matcher matcher = compile.matcher(s);
        int i = matcher.groupCount();
        System.out.println(i);
    }

    private static void test6() {
        String s = "bbcbaba";
        HashSet<Character> chars = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> result = new HashSet();

            if (!chars.add(s.charAt(i))) continue;

            int last = s.lastIndexOf(s.charAt(i));
            for (int j = i + 1; j < last; j++) {
                result.add(s.charAt(j));
            }
            count += result.size();
        }
        System.out.println(count);
    }

    private static void test5() {
        String s = "[a]";
    }

    private static void test4() {
        double v = Double.parseDouble("-123 ");
        System.out.println(v);
    }

    private static int test3(int a, int b) {

        while (a != 0) {
            int temp = 0;
            temp = (a & b) << 1;
            b = (a ^ b);
            a = temp;
        }
        return b;
    }

    private static void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
//        list.remove(Integer.valueOf(3));
        System.out.println(list.hashCode());

        ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
        System.out.println(clone.hashCode());

        clone.remove(1);
        System.out.println(list);
        System.out.println(list == clone);
    }

    private static void test1() {
        int[] nums = {3, 4, 7, 1, 0};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.offer(nums[i]);
        }
        priorityQueue.stream().forEach(System.out::println);
    }
}
enum Color {
    /**
     *
     */
    RED,GREEN,BLUE;
}