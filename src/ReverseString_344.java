public class ReverseString_344 {
    public static void reverseString1(char[] s) {
        // 내가 처음 쓴 답
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
        // 정답
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];   // s[0] 저장
            s[left] = s[right];        // 저장해둔 자리에 뒤에있던 걸 옮기고
            s[right] = temp;        // 저장해둔걸 뒤로 옮겨서 서로 자리를 바꿈.

            left++;       // 그리고 i는 증가시키고
            right--;       // j는 감소시켜서 중간에서 만날때까지 반복
        }
    }

    public static void reverseString3(char[] s) {
        // for loop 버전
        for (int left = 0, right = s.length-1; left <= right; left++, right--) {
            char temp = s[left];   // s[0] 저장
            s[left] = s[right];        // 저장해둔 자리에 뒤에있던 걸 옮기고
            s[right] = temp;        // 저장해둔걸 뒤로 옮겨서 서로 자리를 바꿈.
        }
    }

    public static void main2(String[] args) {
        char[] input = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString1(input);
    }
}
