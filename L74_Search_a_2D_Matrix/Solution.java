class Solution {

  public boolean searchMatrix(int[][] matrix, int target) {

    if(matrix == null || matrix.length ==0) return false;
    int row = matrix.length;
    int col = matrix[0].length;
    int l=0,r=row*col-1;
    while(l<=r){
        int mid = l+(r-l)/2;
        int element = matrix[m/col][m%col];
        if(element == target){
            return true;
        }else if(element > target){
            r = m -1;
        }else{
            l = m+1;
        }
    }
    return false;
  }
}
