import java.util.Scanner;


public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (sc.hasNextLine()) {
                String cStr = sc.nextLine();
                if (cStr.length() > 0) {
                    char target = cStr.charAt(0);
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == target) {
                            count++;
                        }
                    }
                    System.out.println(count);
                }
            }
        }
        sc.close();
    }
}
