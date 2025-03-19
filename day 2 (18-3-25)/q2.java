class Solution {
public:
    bool isPalindrome(int x) 
    {
        if(x<0)
        return false;
        int rev= reverse(x);
        if(x==rev)
        return true;
        else
        return false;
    }
     int reverse(int x)
     {
        int r=0;
        while(x!=0)
        {
         if(r>INT_MAX/10 || r<INT_MIN/10)
         {return 0;}
         r=(r*10)+(x%10);
         x=x/10;

        }
        return r;
     }
};