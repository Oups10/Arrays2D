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
        int[][] mix = new int [3][m];
        for (int i=0;i< Suma.length;i++){
            mix[0][i]=Suma[i];
        }

        for (int j=0 ;j<m;j++){
            int min=numeros[0][j];
            int max=numeros[0][j];
            for (int i=0; i<n;i++){
                if (numeros[i][j]<min){
                    min=numeros[i][j];
                }
                if (numeros[i][j]>max){
                    max=numeros[i][j];
                }
            }
            mix[1][j]=max;
            mix[2][j]=min;
        }
        for (int i=0;i<mix.length;i++){
            for (int j=0;j<mix[i].length;j++){
                System.out.print("|"+mix[i][j]+"|");
            }
            System.out.println();
        }
    }
}