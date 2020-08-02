package tictactoe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //---------------------------------Input
        String s = kb.next();
        String[] L = new String[3];
        L[0] = s.substring(0, 3);
        L[1] = s.substring(3, 6);
        L[2] = s.substring(6);

        int k = 0;
        char [][]m = new char[3][3];
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                m[i][j] = L[i].charAt(j);
                System.out.print(L[i].charAt(j) + " ");
                if (L[i].charAt(j) != '_') {
                    k++;
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------");
        //---------------------------------Part-2
        if (k != 9) {
            System.out.println("Game not finished");
        } else {
            char win = ' ';
            int l = 0;
            if (m[0][0] == m[1][1] && m[1][1] == m[2][2]) {
                win = m[0][0];
                l++;
            } else if (m[0][2] == m[1][1] && m[1][1] == m[2][0]) {
                win = m[0][0];
                l++;
            } else {
                for (int i = 0; i < 3; i++) {
                    if (m[i][0] == m[i][1] && m[i][1] == m[i][2]) {
                        win = m[0][0];
                        l++;
                    } else if (m[0][i] == m[1][i] && m[1][i] == m[2][i]) {
                        win = m[0][0];
                        l++;
                    } else {
                        return;
                    }
                }
            }

            if (l == 0) {
                System.out.println("Draw");
            } else if (l == 1) {
                System.out.println(Character.toUpperCase(win) + " wins");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}

