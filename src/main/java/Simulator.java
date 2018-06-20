public class Simulator {
    private Simulator(){}
    public static void simulateRW(){
        Thread readerThread1 = new Thread(new Reader());
        Thread readerThread2 = new Thread(new Reader());
        Thread readerThread3 = new Thread(new Reader());

        Thread writerThread1 = new Thread(new Writer());
        Thread writerThread2 = new Thread(new Writer());
        Thread writerThread3 = new Thread(new Writer());

        //situation 1.
        /*
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
        */

        //situation 2.
        /*
        readerThread1.start();
        writerThread1.start();
        readerThread2.start();
        writerThread2.start();
        readerThread3.start();
        writerThread3.start();
         */

        //situation 3.
        /*
        writerThread1.start();
        readerThread1.start();
        writerThread2.start();
        readerThread2.start();
        writerThread3.start();
        readerThread3.start();
         */

        //situation 4.
        /*
        writerThread1.start();
        writerThread2.start();
        writerThread3.start();
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
         */
    }
}
