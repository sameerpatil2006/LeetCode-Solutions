package RandomSolutions;

public class MergeSortedArrays {
    public static void mergeSortedArray(int[] a, int[] b, int[] c){
        int res[] = new int[a.length + b.length + c.length];
        int j=0;
        int k=0,l=0,m =0;
        for (int i=0; i<a.length; i++){
            if (a[i] < b[l] && a[i] < c[m]){
                res[j] = a[i];
                j++;
            }
            else if(b[i] < a[i] && b[i] < c[i]){
                res[j] = b[i];
                j++;
            }
            else {
                res[j] = c[i];
                j++;
            }
        }
        System.out.println(res.toString());
    }
}
