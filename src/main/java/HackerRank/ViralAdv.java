public class ViralAdv {

    static int viralAdvertising(int n) {

        int count = 0, people = 5, liked = 0;
        for (int i = 1; i <= n; i++) {
            liked = (people / 2);
            people = liked * 3;
            count = count + liked;
        }
        return count;
    }

    public static void main(String args[]) {

        int days = 5;
        int result = viralAdvertising(days);
        System.out.println(result);
    }
}
