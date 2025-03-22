class Solution{
    public static void setZeroes(int[][] matrix){
        int n=matrix.length;
        int m = matrix[0].length;
        for(int i=0 ;i<n;i++ )
        {
            for(int j=0;j<m;j++ )
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][j]=-1;
                
                }
            }
        }

        for(int i=0 ;i<n;i++ )
        {
            for(int j=0;j<m;j++ )
            {
                if(matrix[i][j]==-1)
                {
                    while(j<m)
                    {
                        if(matrix[i][j]>0)
                        {
                            matrix[i][j]=0;
                        j++;

                        }
                        
                    }
                    
                
                }
            }
        }
    }
}