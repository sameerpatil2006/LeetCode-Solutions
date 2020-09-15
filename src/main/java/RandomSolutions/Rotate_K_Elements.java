package RandomSolutions;

public class Rotate_K_Elements {

    /* 12345678,
       k = 3
       67812345
     */

    public static void rotate(int[] nums, int k) {
        if(k > nums.length){
            k = k-nums.length ;
        }
        if(nums.length != 1 && nums.length != k && k !=0){

            int j = nums.length-k-1;
            for (int i=0; i<(nums.length-k)/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            j = nums.length-1;
            int mid = (j + nums.length-k)/2;

            for (int i=nums.length-k; i<=mid; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }

            j = nums.length-1;
            for (int i=0; i<=nums.length/2; i++){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }

    public static void rotateArray () {
        int array[] = {1,2,3,4,5};
        int d = 2;
        int temp[] = new int[d];

        for(int i=0;i<d;i++) {
            temp[i] = array[i];
        }

        System.out.println("Printing temp");
        for(int i=0; i<temp.length;i++) {
            System.out.println(temp[i]);
        }

        for (int i=0;i<array.length-d;i++) {
            array[i] = array[i+d];
        }

        System.out.println("Printing replaced array");
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }

        int arrayLength = array.length-1;
        for(int i=temp.length-1; i>=0;i--) {
            array[arrayLength] = temp[i];
            arrayLength--;
        }

        System.out.println("Printing final array");
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}
