import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void download(String url) throws IOException {
        URL u = new URL(url);
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(
                        u.openStream()
                )
        );
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("resources/index.html")
                ), true
        );
        String line = bf.readLine();
        Pattern p = Pattern.compile("<img[^<>]+>");
        Pattern p2 = Pattern.compile("src=\"[^\"]+\"");
        while (line != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                String imgLine = m.group();
                System.out.println(imgLine);
                Matcher m2 = p2.matcher(imgLine);
                m2.find();
                String srcLine = m2.group();
                System.out.println(srcLine);
                String imgURL = srcLine.substring(5, srcLine.length() - 1);
                System.out.println(imgURL);
                String [] filenameData = imgURL.split("/");
                String filename = filenameData[filenameData.length - 1];
                System.out.println(filename);
                //downloadFile(imgURL, filename)
                line = line.replace(imgURL, filename);
            }
            pw.println(line);
            line = bf.readLine();
        }
        pw.close();
        bf.close();
    }

    public static void main(String[] args) throws IOException {
        download("https://mu.ac.in/gallery");
    }

}