import java.lang.*;
import java.util.concurrent.*;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println("я" + Thread.getCurrentThread.getName() + "Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
