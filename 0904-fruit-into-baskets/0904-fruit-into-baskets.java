public class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int af = -1, bf = -1;
        int count = 0;
        int max = 0;
        int currmax = 0;

        for(int i=0;i<n;i++){
            int fruit = fruits[i];

            if(fruit == af || fruit == bf){
                currmax++;
            }else{
                currmax = count+1;
            }

            if(fruit == af){
                count++;
            }else{
                count = 1;
                bf = af;
                af = fruit;
            }

            max = Math.max(currmax,max);

        }
        return max;
    }
}