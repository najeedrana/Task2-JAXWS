package com.webservices.transform;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.File;
/** Applies an XSLT stylesheet to transform an XML document, for example into HTML. */
public class XslTransformer {
    public void transform(File xml,File stylesheet,File output) throws TransformerException {
        // The stylesheet controls how source XML elements are selected and presented.
        Transformer transformer=TransformerFactory.newInstance().newTransformer(new StreamSource(stylesheet));
        transformer.transform(new StreamSource(xml),new StreamResult(output));
    }
}
