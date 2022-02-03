import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    
    @Test
    public void testUnclosedParen() throws IOException {
        String contents= Files.readString(Path.of("./test-unclosed-paren.md"));
        List<String> expect = List.of("https://example2.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
