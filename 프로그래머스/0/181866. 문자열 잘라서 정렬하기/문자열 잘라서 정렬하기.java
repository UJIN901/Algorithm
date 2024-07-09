import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> stringList = new ArrayList<>();
        for(String str : answer){
            if(!str.isEmpty()){
                stringList.add(str);
            }
        }
        answer = stringList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}