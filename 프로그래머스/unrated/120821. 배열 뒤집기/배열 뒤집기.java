class Solution {
    public int[] solution(int[] num_list) {
        int num = 0;
        int[] answer = new int[num_list.length];
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = num_list[num];
            num++;
        }
        return answer;
    }
}