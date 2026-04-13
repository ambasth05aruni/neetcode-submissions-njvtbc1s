class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sol = new StringBuilder();
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int index=0;
        while(index<s1.length() && index<s2.length()){
        if(s1.charAt(index)==s2.charAt(index)){
            sol.append(s1.charAt(index));
             index++;
        }else{
            break;
        }
        }
        return sol.toString();
    }
}