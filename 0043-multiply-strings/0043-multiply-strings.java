class Solution {
    public String multiply(String a, String b) {
       if(a.equals("0") || b.equals("0")) return "0";
       int[] res =new int[a.length() +b.length()];
       for(int i=a.length() -1;i>=0;i--)
       for(int j=b.length()-1;j>=0;j--){
        int sum=(a.charAt(i)-'0')*(b.charAt(j)-'0')+res[i+j+1];
        res[i+j+1]=sum%10;
        res[i+j]+=sum/10;
       } 
        StringBuilder ans = new StringBuilder();
        for (int x : res)
            if (!(ans.length() == 0 && x == 0))
                ans.append(x);

        return ans.toString();
    }
}