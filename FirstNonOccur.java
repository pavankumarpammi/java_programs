class Solution {
    public int UniqChar(String s) {

        int index = -1;
        int len = s.length();
        int i = 0;

        while(i < len){
            char c = s.charAt(i);
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);
            if(firstIndex == lastIndex){
                index = i;
                break;

            }
            i++;
        }
        return index;
        
    }
    public static void main(String args[])
    {
        String str ="leetcode";
        Solution  ob = new Solution();
       
        System.out.println( ob.UniqChar(str));
    }
}
