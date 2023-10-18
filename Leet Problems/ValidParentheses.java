class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack <>();
        int i=0;
        while(i<s.length())
        {
            char character = s.charAt(i);
            if (character == '[' || character == '(' || character == '{')
            {
                st.push(character);
            }
            else
            {
                if(st.size()==0) return false;
                if(character ==')' && st.pop()!='(') return false;
                if(character ==']' && st.pop()!='[') return false;
                if(character =='}' && st.pop()!='{') return false;
            }
            i++;
        }
        return st.size()==0;
    }
}