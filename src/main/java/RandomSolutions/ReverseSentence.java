package RandomSolutions;

public class ReverseSentence {

    public static void reverseSentence(String str){
        String split[] = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i= split.length-1; i>=0;i--){
            if(!split[i].equals("")) {
                sb.append(split[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
