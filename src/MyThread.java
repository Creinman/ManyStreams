import java.lang.*;
import java.util.concurrent.*;

class MyThread extends Thread {

    public MyThread(ThreadGroup group) {}

    /*public MyThread(String superName) {
        this.superName = superName;
    }
*/
    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println("я" + Thread.currentThread() + "Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
