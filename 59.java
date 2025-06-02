    // LeetCode Problem 59: Spiral Matrix II
    
class Solution {
    
    
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        int count=1;

        while (sr<=er&&sc<=ec){
            for (int j=sc;j<=ec;j++){
                arr[sr][j]=count++;
            }
            sr+=1;
            for (int i=sr;i<=er;i++){
                arr[i][ec]=count++;
            }
            ec-=1;
            if(sr<=er){
                for (int j=ec;j>=sc;j--){
                    arr[er][j]=count++;
                }
                er-=1;
            }
            if(sc<=ec){
                for (int i=er;i>=sr;i--){
                    arr[i][sc]=count++;
                }
                sc+=1;
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
}
