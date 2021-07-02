import java.lang.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ThreadGroup mainGroup = new ThreadGroup("main group");

        final MyThread thread1 = new MyThread(mainGroup);
        final MyThread thread2 = new MyThread(mainGroup);
        final MyThread thread3 = new MyThread(mainGroup);
        final MyThread thread4 = new MyThread(mainGroup);

// Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();
// ставим задержку 15 секунд
        Thread.sleep(15000);

// Завершаем все потоки одним вызовом
        mainGroup.interrupt();
    }
}
