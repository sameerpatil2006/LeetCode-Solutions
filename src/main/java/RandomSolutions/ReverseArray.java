package RandomSolutions;

public class ReverseArray {
    public static int[] reverse(int a[]){
        int i,j= a.length-1, temp =0;
        for( i=0; i<a.length/2; i++,j--){
            temp = a[i];
            a[i] = a[j];
            a[j]= temp;
        }
        return a;
    }
}
