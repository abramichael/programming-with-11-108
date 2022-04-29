import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Main {
    public static void createByteFile(String filename, int nBytes)
            throws IOException {

        FileOutputStream fos = new FileOutputStream(filename);
        Random r = new Random();
        for (int i = 0; i < nBytes; i++) {
            fos.write(r.nextInt(100));
        }
        fos.close();
    }

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

    public static void download(String url, String filename)
            throws IOException {
        URL urlObject = new URL(url);
        InputStream is = urlObject.openStream();
        FileOutputStream fos = new FileOutputStream(filename);
        for (int i = 0; i < 400; i++) {
            fos.write(100);
        }
        int x = is.read();
        while (x != -1) {
            fos.write(x);
            x = is.read();
        }

        is.close();
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        //createByteFile("resources/1.dat", 100);
        //copy("resources/1.dat", "resources/2.dat");
        download("https://kpfu.ru/portal/docs/F1818801066/IMG_0092.jpg",
                "resources/IMG_0092.jpg");
    }
}
