class Solution {
    public boolean exist(char[][] board, String word) {
        for(int  i=0; i<board.length; i++)
            for(int j=0; j<board[0].length; j++)
                if(board[i][j] == word.charAt(0) && valid(board, word, 0, i, j))
                    return true;

        return false;
    }

    private boolean valid(char[][] board, String word, int n, int x, int y) {
        if(n >= word.length()) return true;

        if(x >= board.length || y >= board[0].length || x < 0 || y < 0 || board[x][y] != word.charAt(n)) return false;

        boolean found;
        char temp = board[x][y];

        board[x][y] = '#';

        found = valid(board, word, n+1, x+1, y) || valid(board, word, n+1, x-1, y) ||
                valid(board, word, n+1, x, y+1) || valid(board, word, n+1, x, y-1);
        
        board[x][y] = temp;

        return found;
    }
}