import java.util.Scanner;

public class ArrayConUnoUno {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Da quanti elementi è fatto l'array:");
        int [] v=new int [in.nextInt()];
        System.out.println();
        for (int i=0;i<v.length;i++){
            System.out.print("Inserire parola "+(i+1)+" :");
            v[i]= in.nextInt();
        }
        if (isOne(v))
            System.out.println("Vero");
        else
            System.out.println("Falso");
    }
    public static boolean isOne(int [] x){
        boolean isOnlyOne=false;
        for (int p=0;p<x.length;p++){
            if (x[p]==1)
                isOnlyOne=true;
            else {
                isOnlyOne=false;
                break;
            }
        }
        return isOnlyOne;
    }
}