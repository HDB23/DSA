public class insertionSort
{
    public static void printArray(int A[])
    {
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int A[] = {7, 8, 5, 3, 1};
        System.out.print("Array Before Sort : ");
        printArray(A);
        for(int i=1; i<A.length; i++)
        {
            int current = A[i];
            int j = i-1;
            while(j>=0 && current < A[j])
            {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = current;
        }
        System.out.print("\nArray After Sort : ");
        printArray(A);
    }
}