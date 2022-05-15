public class InvertirMatriz{

    public static void main(String[]args){
        int[] A = {1,2,3,4};
        System.out.println("La matriz invertida seria:");
        for(int i=0;i<A.length;i++){
            System.out.println(invertirArray(A)[i]);
        }

    }
    public static int[] invertirArray(int[] A){
        int[] Ain = new int[A.length];
        for(int i=0,j=A.length-1;i<A.length;i++,j--){
            Ain[i] = A[j];
        }
        return Ain;
    }
}