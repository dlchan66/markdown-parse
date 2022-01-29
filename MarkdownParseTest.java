import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    
    @Test
    public void testUnclosedBracket() throws IOException {
        String contents= Files.readString(Path.of("./test-unclosed-bracket.md"));
        List<String> expect = List.of("https://example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
