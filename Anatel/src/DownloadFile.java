import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.net.URL;


public class DownloadFile {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:10080/fiscaliza323/issues.csv?key=25970ab019a3f2a5fe216c7716f881fbb9ece891");
        File file = new File("/Users/alexcosta/Desktop/Anatel/fiscaliza1.xml");

        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    //legal

    }
}