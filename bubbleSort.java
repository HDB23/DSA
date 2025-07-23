public class bubbleSort {
    public static void main(String[] args) {
        int A[] = {9, 3, 2, 5, 10, 1};

        int temp = 0;

        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] > A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int k=0; k<A.length; k++){
            System.out.print(A[k] + " ");
        }
    }
}