package RandomSolutions;

public class ArmStrong {

    public static boolean isArm(int num){
        int pal = num;
        int cube =1, rem =0, total=0;
        while(num > 0) {
            rem = num % 10;
            cube = rem * rem * rem;
            num = num / 10;
            total = total + cube;
        }
        if (total == pal)
            return true;
        else
            return false;
    }
}
