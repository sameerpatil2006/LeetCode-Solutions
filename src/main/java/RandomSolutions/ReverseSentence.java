package RandomSolutions;

public class ReverseSentence {

    public static void reverseSentence(String str){
        String split[] = str.split(" ");
        for (int i= split.length-1; i>=0;i--){
            System.out.print(split[i] + " ");
        }
    }

}
