import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class DownloadFileTest {

    @Test
    public void verifyThatFileWasDownloaded() throws Exception {
        FileUtils.downloadFile();
        boolean exists = Files.exists(Paths.get("NewTxt.txt"), LinkOption.NOFOLLOW_LINKS);
        assertTrue("The file wasn't found", exists);
    }
}
