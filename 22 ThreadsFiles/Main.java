import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    private static CopyThread t1;
    private static CopyThread t2;

    public static void copy(String filename1, String filename2)
            throws IOException {

        FileInputStream fis = new FileInputStream(filename1);
        FileOutputStream fos = new FileOutputStream(filename2);
        int x = fis.read();
        while (x != -1) {
            fos.write(x);
            x = fis.read();
        }
        fis.close();
        fos.close();

    }

    public static void copyNTimesWith2ThreadOld(String filepath, int n) throws InterruptedException {
        /*
        for (int i = 0; i < n; i += 2) {
            Thread t1 = new CopyThread(filepath, i);
            t1.start();
            if ((i + 1) < n) {
                Thread t2 = new CopyThread(filepath, i + 1);
                t2.start();
                t2.join();
            }
            t1.join();
        }
        */
        int d = n % 2;
        n = d == 0 ? n : n - 1;
        for (int i = 0; i < n; i += 2) {
            Thread t1 = new CopyThread(filepath, i);
            t1.start();
            Thread t2 = new CopyThread(filepath, i + 1);
            t2.start();
            t1.join();
            t2.join();
        }
        if (d == 1) {
            Thread t1 = new CopyThread(filepath, n);
            t1.start();
            t1.join();
        }
    }

    public static void copyNTimesWith2ThreadNew(String filepath, int n) {
        for (int i = 0; i < n; i++) {
            CopyThread t = getAvailableThread();
            t.setN(i);
            t.setFilepath(filepath);
            t.start();
        }
    }

    private static CopyThread getAvailableThread() {
        while (true) {
            if (t1 == null || !t1.isAlive()) {
                t1 = new CopyThread();
                return t1;
            } else if (t2 == null || !t2.isAlive()) {
                t2 = new CopyThread();
                return t2;
            }
        }
    }

    public static void main(String[] args) {
        t1 = new CopyThread();
        t2 = new CopyThread();
        String filepath = "Main.java";
        int n = 10;
        copyNTimesWith2ThreadNew(filepath, n);
    }
}
