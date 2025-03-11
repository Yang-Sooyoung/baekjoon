class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
 
        // 최대 공배수 = 두 수의 곱 / 최대공약수
        return new int[] { max, n * m / max };
    }
}