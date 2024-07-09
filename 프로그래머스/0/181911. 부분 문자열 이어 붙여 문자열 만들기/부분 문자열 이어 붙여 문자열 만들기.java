public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < my_strings.length; i++){
            int start = parts[i][0];
            int end = parts[i][1];
            if(my_strings[i].length() - 1 == end){
                stringBuilder.append(my_strings[i].substring(start));
                continue;
            }
            stringBuilder.append(my_strings[i].substring(start, end + 1));
        }

        String answer = stringBuilder.toString();
        return answer;
    }
}