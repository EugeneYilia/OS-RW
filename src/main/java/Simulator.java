public class Simulator {
    private Simulator(){}
    public static void simulateRW(){
        Thread readerThread1 = new Thread(new Reader());
        Thread readerThread2 = new Thread(new Reader());
        Thread readerThread3 = new Thread(new Reader());

        Thread writerThread1 = new Thread(new Writer());
        Thread writerThread2 = new Thread(new Writer());
        Thread writerThread3 = new Thread(new Writer());

        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
    }
}
