public class ThreadExample extends Thread {
    private int n;

    public ThreadExample(int size) {

        this.n = size;
    }
    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName() + " fact "+ factoriel(n));
    }
    private int factoriel(int N) {
        return N>0 ? factoriel(N-1)*N : 1;
    }

}

