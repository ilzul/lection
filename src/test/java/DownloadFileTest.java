import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class DownloadFileTest {

    @Before
    public void setUp(){
        try {
            Files.deleteIfExists(Paths.get("NewTxt.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyThatFileWasDownloaded() throws Exception {
        FileUtils.downloadFile();
        boolean exists = Files.exists(Paths.get("NewTxt.txt"), LinkOption.NOFOLLOW_LINKS);
        assertTrue("The file wasn't found", exists);
    }
}
