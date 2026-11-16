package com.webservices.transform;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Files;
import static org.junit.jupiter.api.Assertions.*;
/** Confirms that the XSLT stylesheet produces an HTML document containing student data. */
class XslTransformerTest {
    @Test void transformsXmlToHtml() throws Exception {
        File output=File.createTempFile("student-view",".html");
        new XslTransformer().transform(new File("src/main/resources/student.xml"),
                new File("src/main/resources/student-to-html.xsl"),output);
        String html=Files.readString(output.toPath());
        assertTrue(html.contains("Rana Khalid"));
        assertTrue(html.contains("Student information"));
        output.delete();
    }
}
