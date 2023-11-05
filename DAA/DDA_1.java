class DAA_1 {
    public static void main(String args[]) {
        int n = 15;
        int a = 0;
        int b = 1;
        int c = a + b;
        // System.out.print(a + " " + b + " ");
        for (int i = 0; i < n; i++) {
            int num = recursive(i);
            System.out.print(num + " ");
            // System.out.print(c + " ");
            // a = b;
            // b = c;
            // c = a + b;
        }
    }

    public static int recursive(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return recursive(num - 1) + recursive(num - 2);
        }
    }
}