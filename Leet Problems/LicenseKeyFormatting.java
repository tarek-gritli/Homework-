class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int n=k;
        String reversed="";
        String ch="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='-')
            {   
                if(n==0)
                {
                    reversed+='-';
                    n=k;
                }
                n--;
                char c=Character.toUpperCase(s.charAt(i));
                reversed+=c;
            }
        }
        for(int i=reversed.length()-1;i>=0;i--)
        {
            ch+=reversed.charAt(i);
        }
        return ch;
    }
}