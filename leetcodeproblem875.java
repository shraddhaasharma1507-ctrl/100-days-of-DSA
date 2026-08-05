class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st=1;
        int end = koko(piles);
        while(st<end){
            int mid = st + (end -st)/2;
            int hour =0;
            for (int pile: piles){
               hour += (pile + mid-1)/mid;
            }
            if(hour<=h){
             end = mid ;
            }
            else{
                st= mid +1;
            }
        } 
        return st;
    }

    public int koko(int [] piles){
       int max = piles[0];
       for(int pile : piles){
        if (pile>max){
            max= pile;
        }
       }
        return max;
    }
   
}