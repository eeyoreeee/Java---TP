public class fibo {
    public static void main(String[] args) {
        int u0=1, u1=1, u2;
        int n=0;
        while(n<=6){
            System.out.println(u0);
            u2=u0+u1;
            u0=u1;
            u1=u2;
            n=n+1;
        }

    }
}
