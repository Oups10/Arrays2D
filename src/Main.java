import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduix el numero n");
        int n = sc.nextInt();
        System.out.println("introduix el numero m");
        int m = sc.nextInt();
        int[][] numeros = new int[n][m];
        System.out.println("introduix els numeros");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = sc.nextInt();
            }
        }
        int[] Suma = new int[m];
        System.out.print("{");
        for (int i = 0; i < m; i++) {
            int S = 0;
            for (int j = 0; j < n; j++) {
                S = S + numeros[j][i];
            }
            Suma[i] = S;
            System.out.print(Suma[i] + ",");
        }
        System.out.println("}");
    }
}
