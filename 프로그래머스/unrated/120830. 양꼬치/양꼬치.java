class Solution {
    public int solution(int n, int k) {
        int answer = (n * 12000) + (k * 2000);
        int discount = (n / 10) * 2000;
        return answer - discount;
    }
}