import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int turnCounter = 0;
        initGame();
    }
    public static Scanner sc = new Scanner(System.in);

    static void initGame()
    {
        int len = sc.nextInt();
        char[] boardLen = new char[len];
        char[][] board = new char[len][len];
        for (int i = 0; i<len; i++)
        {
            for (int j = 0; j<len; j++)
            {
                board[i][j] = '-';
            }
        }
        xyInput(board, len);
        drawGame(len, board);
    }
    static char[] xyInput(char[][] board, int len)
    {
        char noughtOrCross;
        System.out.println("Enter X Row: ");
        int X = sc.nextInt();
        System.out.println("Enter Y Column: ");
        int Y = sc.nextInt();
        board[X][Y] = 'X';
        return board[X];
    }
    static void drawGame(int len, char[][] board)
    {
        for (int i = 0; i<len; i++)
        {
            System.out.println(board[i]);
        }
    }
}
