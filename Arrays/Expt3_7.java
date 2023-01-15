package Arrays;

import java.util.Arrays;

//Write a program to find transpose of a 3X4 matrics?
public class Expt3_7 {
    public static void main(String[] args) {
        int [][]a={{1,2,3,5},{2,3,4,6},{1,3,6,5}};
        System.out.println("The Matrix is :");
        for(int i=0;i<a.length;i++)
        System.out.println(Arrays.toString(a[i]));
        System.out.println("Transpose of this matrix is :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
