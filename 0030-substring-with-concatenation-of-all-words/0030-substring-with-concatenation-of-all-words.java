class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();
        int n=words[0].length(),total=n* words.length;
        Map<String, Integer> need =new HashMap<>();
        for(String w: words)need.put(w, need.getOrDefault(w,0)+1);
        for(int i=0;i<n;i++){
            int l=i, count =0;
            Map<String,Integer> map=new HashMap<>();
            for(int r=i;r+n<=s.length();r+=n){
                String w=s.substring(r,r+n);
                if(!need.containsKey(w)){
                    map.clear();count=0;
                    l=r+n;
                }else{
                    map.put(w,map.getOrDefault(w,0)+1);
                    count++;
                    while(map.get(w)> need.get(w)){
                        String x=s.substring(l,l+n);
                        map.put(x,map.get(x)-1);
                        l+=n;
                        count--;
                    }
                    if(count == words.length) ans.add(l);

                }
            }
        }
        return ans;
    }
}