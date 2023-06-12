public class lemonadeChange {
    public static boolean lemonChange(int[] bills) {
        int d5 = 0, d10 = 0, d20 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                d5++;
            } else if (bills[i] == 10) {
                if (d5 == 0) {
                    return false;
                }
                d10++;
                d5--;
            } else {
                if (d5 > 0 && d10 > 0) {
                    d5--;
                    d10--;
                    d20++;
                } else if (d5 >= 3) {
                    d5 -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] bill = {5, 5, 5, 10, 20};
        boolean res = lemonChange(bill);
        System.out.println(res);
    }
}


