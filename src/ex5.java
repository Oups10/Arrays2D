import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        float[][] notas = new float[20][6];
        Scanner sc = new Scanner(System.in);
        for (int i=0 ; i<notas.length;i++){
            for (int j=0 ; j<3;j++){
                System.out.println("introduix la nota "+(j+1)+" de alumno "+(i+1));
                notas[i][j]= sc.nextInt();
            }
        }
        float med=0;
        for (int i=0 ; i<notas.length;i++) {
            med = (notas[i][0]+notas[i][1]+notas[i][2])/3;
            notas[i][3]=med;
        }
        for (int i=0 ; i<notas.length;i++) {
            float min=notas[i][0];
            float max=notas[i][0];
            for (int j=0;j<3;j++){
                if (notas[i][j]<min){
                    min=notas[i][j];
                }
                if (notas[i][j]>max){
                    max=notas[i][j];
                }
            }
            notas[i][4]=max;
            notas[i][5]=min;
        }
        System.out.println("------------------------");
        for (int i=0;i<notas.length;i++){
            for (int j=0;j<notas[i].length;j++){
                System.out.print("|"+notas[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("------------------------");
        float mejor=notas[0][3];
        float peor=notas[0][3];
        for (int i=0;i< notas.length;i++){
            if(notas[i][3]<peor){
                peor=notas[i][3];
            }
            if(notas[i][3]>mejor){
                mejor=notas[i][3];
            }
        }
        System.out.println("la mejor nota del curso es : "+mejor);
        System.out.println("la peor nota del curso es : "+peor);
    }
}
