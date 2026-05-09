public class Q4_Longest_common_subsequence {


        public static void main(String[] args) {

            String name = "HARSHWARDHAN";
            String target = "ETAOINSHR";

            char[] X = name.toCharArray();
            char[] Y = target.toCharArray();


            lcsLength(X, Y);
        }

        public static void lcsLength(char[] X, char[] Y) {
            int m = X.length;
            int n = Y.length;


            int[][] b = new int[m + 1][n + 1];
            int[][] c = new int[m + 1][n + 1];


            for (int i = 1; i <= m; i++) c[i][0] = 0;
            for (int j = 0; j <= n; j++) c[0][j] = 0;


            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (X[i - 1] == Y[j - 1]) {
                        c[i][j] = c[i - 1][j - 1] + 1;
                        b[i][j] = 1; //
                    } else if (c[i - 1][j] >= c[i][j - 1]) {
                        c[i][j] = c[i - 1][j];
                        b[i][j] = 2;
                    } else {
                        c[i][j] = c[i][j - 1];
                        b[i][j] = 3;
                    }
                }
            }

            System.out.println("String 1: " + new String(X));
            System.out.println("String 2: " + new String(Y));
            System.out.println("LCS Length: " + c[m][n]);
            System.out.print("LCS String: ");


            printLcs(b, X, m, n);
            System.out.println();
        }


        public static void printLcs(int[][] b, char[] X, int i, int j) {
            if (i == 0 || j == 0) {
                return;
            }
            if (b[i][j] == 1) {
                printLcs(b, X, i - 1, j - 1);
                System.out.print(X[i - 1]);
            } else if (b[i][j] == 2) {
                printLcs(b, X, i - 1, j);
            } else { 
                printLcs(b, X, i, j - 1);
            }
        }
    }

