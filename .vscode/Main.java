import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String[] input = scanner.nextLine().split(" ");
        int[] houseMoney = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            houseMoney[i] = Integer.parseInt(input[i]);
        }
        int[] output = maximizeStolenMoney(houseMoney);
        System.out.println(output[0]);
        for (int i = 1; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

    public static int[] maximizeStolenMoney(int[] houseMoney) {
    int n = houseMoney.length;
    if (n == 0) {
        return new int[]{0};
    }

    int[] result1 = robRange(houseMoney, 0, n - 2);
    int[] result2 = robRange(houseMoney, 1, n - 1);

    if (result1[0] > result2[0]) {
        return result1;
    } else {
        return result2;
    }
}

    public static int[] robRange(int[] houseMoney, int start, int end) {
        int n = houseMoney.length;
        int[] dp = new int[n];
        List<Integer> selectedHouses = new ArrayList<>();

        dp[start] = houseMoney[start];
        dp[start + 1] = Math.max(houseMoney[start], houseMoney[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + houseMoney[i]);
        }

        int i = end;
        while (i >= start + 2) {
            if (dp[i] == dp[i - 1]) {
                i -= 1;
            } else {
                selectedHouses.add(i + 1);
                i -= 2;
            }
        }

        if (i == start + 1) {
            selectedHouses.add(start + 2);
        } else if (i == start) {
            selectedHouses.add(start + 1);
        }

        int[] result = new int[selectedHouses.size() + 1];
        result[0] = dp[end];
        for (int j = 0; j < selectedHouses.size(); j++) {
            result[j + 1] = selectedHouses.get(j);
        }

        return result;
    }
}



