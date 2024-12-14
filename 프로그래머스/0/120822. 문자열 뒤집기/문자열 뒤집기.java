class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(my_string).reverse();
        answer = stringBuilder.toString();
        return answer;
    }
}