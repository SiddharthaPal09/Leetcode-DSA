class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n=s.length();
    HashSet<Character>seen=new HashSet<>();   
    int i=0;
    int maxLength=0;
    for(int j=0;j<n;j++){
        while(seen.contains(s.charAt(j))){
            seen.remove(s.charAt(i));
            i++;
        }
        seen.add(s.charAt(j));
        maxLength=Math.max(maxLength,j-i+1);
    }
    return maxLength;
    }
}