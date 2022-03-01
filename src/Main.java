import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnCounter = 0;
        char bg = '#';
        int boardLen = sc.nextInt();
        char[][] boardXY = new char[boardLen][boardLen];
        for(int i = 0; i < boardLen; i++)
        {
            for(int k = 0; k < boardLen; k++)
            {
                boardXY[i][k] = bg;
            }
        }
        drawGame(boardLen, boardXY);
        getInput(sc, boardLen, boardXY);
        drawGame(boardLen, boardXY);
    }
    static void drawGame(int len, char[][] XY)
    {
        for (int i = 0; i < len; i++)
        {
            System.out.println(XY[i]);
        }
    }
    static char[][] getInput(Scanner sc, int len, char[][] XY)
    {
        int input = sc.nextInt();
        int X = Integer.toString(input).charAt(0);
        int Y = Integer.toString(input).charAt(1);
        //Gå till rätt Y Koordinat först, sedan gå till rätt X Koordinat. For loop.
        for(int i = 0; i < len; i++)
        {
            if (X == i)
            {
                for (int j = 0; j < len; j++)
                {
                    if (Y == j)
                    {
                        XY[i][j] = 'X';
                        System.out.println(XY[i][j]);
                    }
                }
            }
        }
        return XY;
    }
}