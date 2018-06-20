public class Reader implements Runnable {
    public void run() {
        try {
            synchronized (MailBox.readerNumber) {
                MailBox.readerNumber++;
            }
            System.out.println("Reader is ready to read.");
            while (true) {
                if (!MailBox.hasWriter) {
                    System.out.println("Reader start to read.");
                    Thread.sleep(1000);
                    System.out.println("Reader finish reading.");
                    synchronized (MailBox.readerNumber) {
                        MailBox.readerNumber--;
                    }
                    break;
                }
                //wait
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
