package num13;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        int[][] res_numbers = new int[10][10];
        int count = 0;
        int Max_ID = 0, Min_ID = 100;
        int imax_ID =0,jmax_ID =0;
        int imin_ID =0,jmin_ID =0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                count++;
                numbers[i][j] = count;
                System.out.print( numbers[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(Max_ID < numbers[i][j]) {
                    Max_ID = numbers[i][j];
                    imax_ID = i;
                    jmax_ID = j;
                }
                if(Min_ID > numbers[i][j]) {
                    Min_ID = numbers[i][j];
                    imin_ID = i;
                    jmin_ID = j;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(jmax_ID != j && jmin_ID != j && imax_ID != i && imin_ID != i)
                {
                    res_numbers[i][j] = numbers[i][j];
                }
                if(i == imax_ID)
                {
                    res_numbers[i][j] = numbers[imin_ID][j];
                }
                if(j == jmax_ID)
                {
                    res_numbers[i][j] = numbers[i][jmin_ID];
                }
                if(i == imin_ID)
                {
                    res_numbers[i][j] = numbers[imax_ID][j];
                }
                if(j == jmin_ID)
                {
                    res_numbers[i][j] = numbers[i][jmax_ID];
                }
            }
        }

        System.out.println();

        for (int i = 0; i < res_numbers.length; i++) {
            for (int j = 0; j < res_numbers.length; j++) {
                System.out.print(res_numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
