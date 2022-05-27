import java.io.IOException;

public class CopyThread extends Thread {
    private String filepath;
    private int n;

    public CopyThread() {

    }

    public CopyThread(String filepath, int n) {
        this.filepath = filepath;
        this.n = n;
    }

    public void run() {
        // ToDo: do correct filenaming with respect to extention
        String newfilepath = filepath + n;
        try {
            Main.copy(filepath, newfilepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilepath() {
        return filepath;
    }
}
