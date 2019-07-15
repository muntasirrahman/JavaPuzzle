import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindLeader {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            try {
                int k = scan.nextInt();
                num.add(k);
            } catch (Exception e) {}
        }
        scan.close();

        //findLeader(num);
        //minOfSubArray(m, num);
    }

    static void findLeader(List<Integer> data) {
        //System.out.println(num);

        List<Integer> leader = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = data.size() - 1; i >= 0; i--) {
            int a = data.get(i);
            if (a > max) {
                leader.add(a);
                max = a;
            }
        }

        Collections.reverse(leader);
        int ln = leader.size();
        for (int i = 0; i < ln; i++) {
            if (i == (ln -1)) {
                System.out.print(leader.get(i));
            } else {
                System.out.println(leader.get(i));
            }
        }
    }
}
