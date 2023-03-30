public class ReverseString_344 {
    public static void reverseString1(char[] s) {
        char[] r = new char[s.length];
        int j = 0;
        for (int i = s.length-1; i >= 0; i--) {
            r[j] = s[i];
            j++;
        }
        s = r;
        System.out.println(s);
    }

    public static void reverseString2(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i < j) {
            char temp = s[i];   // s[0] 저장
            s[i] = s[j];        // 저장해둔 자리에 뒤에있던 걸 옮기고
            s[j] = temp;        // 저장해둔걸 뒤로 옮겨서 서로 자리를 바꿈.

            i++;       // 그리고 i는 증가시키고
            j--;       // j는 감소시켜서 중간에서 만날때까지 반복
        }
    }
    public static void main(String[] args) {
        char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString1(input);
    }
}
