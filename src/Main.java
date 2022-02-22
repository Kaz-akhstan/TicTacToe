import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] boardXY = new int[2][n];
        for (int i = 0; i < n; i++)
        {
            boardXY[0][i] = i;
            boardXY[1][i] = i;
        }
        drawGame(n);
    }
    static void drawGame(int len)
    {
        for (int i = 0; i<len; i++)
        {
            System.out.println();
        }
    }
}