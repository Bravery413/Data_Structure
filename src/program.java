class program {
    public static int times=0;
    public static void main(String[] args) {

        int i;
        i = x(x(8));
        System.out.println(times);
    }

    static int x(int n) {
        times++;
        if (n <= 3)
            return 1;
        else
            return x(n - 2) + x(n - 4) + 1;
    }
}