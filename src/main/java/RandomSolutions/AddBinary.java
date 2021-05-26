package RandomSolutions;

public class AddBinary {
     static int carry =0;
    public static String addBinary(String a, String b) {
        int strALen = a.length()-1;
        int strBLen = b.length()-1;
        StringBuilder sb = new StringBuilder();

        while (strALen >= 0  || strBLen >= 0) {
           if (strALen >= 0 && strBLen >= 0) {
               sb.append(sum(a.charAt(strALen) - '0', b.charAt(strBLen) - '0'));
           } else if (strALen < 0 && strBLen >= 0) {
               sb.append(sum(0, b.charAt(strBLen) - '0'));
           } else if (strBLen < 0 && strALen >= 0) {
               sb.append(sum(a.charAt(strALen) - '0', 0));
           }
           strALen--;
           strBLen--;
        }
        if (carry !=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static int sum(int a, int b){
        int sum = a + b + carry;
        carry =0;
        if (sum == 0){
            return 0;
        }
        else if (sum == 1){
            return 1;
        }
        else if (sum == 2){
            carry = 1;
            return 0;
        }
        else {
            carry = 1;
            return 1;
        }
    }
}
