public class RotacionIzquierda {
    public static void main(String[]args){
        int[] A = {1,2,3,4,5,6,7};
        System.out.println("La nueva matriz es: ");
        for(int i=0;i<A.length;i++){
            System.out.print(rotarIzquierdaArray(A)[i]+" ");
        }

    }
    public static int[] rotarIzquierdaArray(int[] A){
        int[] Aiz = new int[A.length];
        int d = 3;
        for(int i=0;i<A.length-d;i++){
            Aiz[i+d] =A[i];
        }
        for(int i=0;i<d;i++){
            Aiz[i] =A[A.length-d+i];
        }
        return Aiz;
    }

}
