class Solution {
    public int[] solution(int money) {
        
        int americanoPrice = 5500;
        
        int numAmericano = money / americanoPrice;
        
        int remainingMoney = money % americanoPrice;
        
        int[] answer = {numAmericano, remainingMoney};
        return answer;
    }
}