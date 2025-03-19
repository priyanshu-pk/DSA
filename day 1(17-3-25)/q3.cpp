class Solution {
    public:
        int maxProfit(vector<int>& prices)
         {
            int minprice=prices[0];
            int prof=0;
    
            for (int i=1;i<prices.size();i++)
            {
                prof= max(prof,prices[i]-minprice);
                minprice=min(prices[i],minprice);
            }
            return prof;
         }
    };