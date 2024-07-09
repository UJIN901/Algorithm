public class Solution {

    public String solution(String my_string, int[][] queries) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(my_string);

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            String temp = stringBuilder.toString().substring(start, end + 1);
            String reversed = new StringBuilder(temp).reverse().toString();

            stringBuilder.replace(start, end + 1, reversed);
        }

        String answer = stringBuilder.toString();
        return answer;
    }
}