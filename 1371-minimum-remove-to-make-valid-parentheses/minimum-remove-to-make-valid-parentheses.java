class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder ans = new StringBuilder(s);
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                st.push(i);
            else if(s.charAt(i) == ')')
            {
                if(st.size() > 0 && s.charAt(st.peek()) == '(')
                    st.pop();
                else
                    st.push(i);
            }
        }
        
        while(st.size()>0)
            ans.deleteCharAt(st.pop());
        
        return ans.toString();
    }
}