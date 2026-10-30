public class ex3 {
    public static void main(String[] args) {
        char[][] m = new char[5][5];
        System.out.println("------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || i == j) {
                    m[i][j] = 'X';
                } else {
                    m[i][j] = ' ';
                }
                System.out.print("|"+m[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("------------");
    }
}

