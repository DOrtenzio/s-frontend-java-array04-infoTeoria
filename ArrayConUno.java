import java.util.Scanner;

public class ArrayConUno {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Da quanti elementi è fatto l'array:");
        int [] v=new int [in.nextInt()];
        System.out.println();
        for (int i=0;i<v.length;i++){
            System.out.print("Inserire parola "+(i+1)+" :");
            v[i]= in.nextInt();
        }
        boolean isOne=false;
        for (int p=0;p<v.length;p++){
            if (v[p]==1)
                isOne=true;
            else {
                isOne=false;
                break;
            }
        }
        if (isOne)
            System.out.println("Vero");
        else
            System.out.println("Falso");

    }
}