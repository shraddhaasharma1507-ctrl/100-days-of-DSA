public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int largest = a[0];
        int slargest =Integer.MIN_VALUE;
        for (int i=1; i<n;i++){
            if (a[i]>largest){
                slargest = largest;
                largest = a[i];
            }
            else if ((a[i]>slargest)&& (a[i]!=largest)){
                slargest = a[i];
            }
        }
        int smallest = a[0];
        int ssmallest =Integer.MAX_VALUE;
        for (int j =1;j<n;j++){
            if (a[j]<smallest){
                ssmallest= smallest;
                smallest = a[j];
            }
            else if ((a[j]<ssmallest)&&(a[j]!=smallest)){
                ssmallest = a[j];
            }
        }
        return new int []{slargest, ssmallest};
    }
}