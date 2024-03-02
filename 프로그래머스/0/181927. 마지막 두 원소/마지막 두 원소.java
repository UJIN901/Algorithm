class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        for(int i = 0; i <= len; i++){
            if(i == len){
                if(num_list[len - 1] - num_list[len - 2] > 0){
                   answer[len] = num_list[len - 1] - num_list[len - 2];
                }
                else{
                    answer[len] = num_list[len - 1] * 2;
                }
            }
            else{
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}