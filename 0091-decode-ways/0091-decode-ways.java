class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int a=1,b=1;
        for(int i=1;i<s.length();i++){
            int c=0;
            if(s.charAt(i) !='0') c+=b;
            int x=(s.charAt(i-1)-'0') * 10+(s.charAt(i)-'0');
            if(x>=10 && x<=26)c+=a;
            a=b;
            b=c;

        }
        return b;
    }
}