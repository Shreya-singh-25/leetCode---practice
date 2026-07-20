class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] num3=new int[num1.length+num2.length];
        int i=0,j=0,k=0;
        while(i<num1.length && j<num2.length)
        num3[k++] = num1[i]<num2[j] ? num1[i++]:num2[j++];
        while(i<num1.length) num3[k++]=num1[i++];
        while(j<num2.length) num3[k++]=num2[j++];
        int n=num3.length;
        return n%2==0?(num3[n/2-1] + num3[n/2])/2.0 : num3[n/2];

        
    }
}