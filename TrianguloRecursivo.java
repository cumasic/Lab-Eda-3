import java.util.Scanner;
public class TrianguloRecursivo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int b;
        System.out.println("Ingrese la base de la pirámide");
        b = sc.nextInt();
        trianguloRecursivo(b);

    }
    public static void trianguloRecursivo(int base){ 
        if(base == 1){
            System.out.println("*");
        }
        else{
            for(int i=0;i<base;i++){
                System.out.print("*");
            }
            System.out.println();
            trianguloRecursivo(base-1);
        }
    }
}
