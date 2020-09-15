import java.util.*;

public class Priorities {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(8);

        newList = priority(list);
    }

    public static List<Integer> priority(List<Integer> list){
       // List<Integer> newQueue = new ArrayList<>();
        int arr[] = new int[100];
        for(int i=0; i<list.size(); i++){
            //System.out.println("list -"+list.get(i));
            int count = arr[list.get(i)];
            arr[list.get(i)] = count +1;
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0; i<list.size(); i++){
            for(int j=list.get(i); j>0; j--){
                if(j>0 && arr[j-1]==0){
                    arr[j-1] = arr[j];
                    arr[j] =0;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> newQueue = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                break;
            if(arr[i] > 1){
                for(int j=0; j<arr[i]; j++){
                    newQueue.add(arr[i]);
                }
            }
            else {
                newQueue.add(arr[i]);
            }
        }
        System.out.println("ans"+newQueue);

        return newQueue;
    }
}
