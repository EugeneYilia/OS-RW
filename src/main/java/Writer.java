public class Writer implements Runnable {
    public void run() {
        try {
            System.out.println("Writer is ready to write.");
            while (true) {
                if (!MailBox.hasReader()) {
                    synchronized (MailBox.hasWriter) {
                        if (!MailBox.hasWriter) {
                            MailBox.hasWriter = true;
                            System.out.println("Writer start to write.");
                            Thread.sleep(1000);
                            System.out.println("Writer finish writing.");
                            MailBox.hasWriter = false;
                            break;
                        }
                    }
                }
                //wait
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
