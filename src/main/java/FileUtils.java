import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUtils {

    public static void downloadFile() throws Exception{
        URL url = new URL("https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt");
        InputStream in = url.openStream();
        Files.copy(in, Paths.get("NewTxt.txt"), StandardCopyOption.REPLACE_EXISTING);
        in.close();
    }
}
