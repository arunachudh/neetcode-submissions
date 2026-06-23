class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int rows = matrix.length;
        int midRow=0;
        int topRow = 0, botRow = rows-1;

        while(topRow<=botRow){
            midRow = (topRow + botRow)/2;
            if(target > matrix[midRow][col-1]){
                topRow = midRow + 1;
            }
            else if(target < matrix[midRow][0]){
                botRow = midRow - 1;
            }
            else{
                break; //we have identified the row.
            }
        }

        // If no rows were identified, return false
        if(topRow>botRow){
            return false;
        }

        //Now searching the row for the element using Binary Search
        //int midRow = (topRow + botRow) /2; // Since 
        int left = 0, right = matrix[0].length;
        while(left <= right){
            int mid = (left + right)/2;
            if(target > matrix[midRow][mid]){
                left = mid + 1;
            }
            else if(target < matrix[midRow][mid]){
                right = mid - 1;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
