class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Character>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> colMap = new HashMap<>();
        HashMap<Integer, HashSet<Character>> boxMap = new HashMap<>();
        
        int rows = board.length;
        int cols = board[0].length;
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(board[i][j] == '.') continue;
                char num = board[i][j];
                int boxIndex = (i / 3) * 3 + (j / 3);
                rowMap.putIfAbsent(i, new HashSet<>());
                colMap.putIfAbsent(j, new HashSet<>());
                boxMap.putIfAbsent(boxIndex, new HashSet<>());
                if(rowMap.get(i).contains(num) || 
                   colMap.get(j).contains(num) || 
                   boxMap.get(boxIndex).contains(num)) {
                    return false;
                }
                rowMap.get(i).add(num);
                colMap.get(j).add(num);
                boxMap.get(boxIndex).add(num);
            }
        }
        
        return true;
    }
}