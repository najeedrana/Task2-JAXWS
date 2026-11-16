package com.webservices.transform;

import org.apache.fop.apps.*;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/** Uses Apache FOP to render XSL-FO formatting objects as a PDF file. */
public class PdfTransformer {
    public void transform(File xml,File xslFo,File pdf) throws Exception {
        // FOP factory creates a processor for the PDF output format.
        FopFactory factory=FopFactory.newInstance(new File(".").toURI());
        try(OutputStream out=new BufferedOutputStream(new FileOutputStream(pdf))) {
            Fop fop=factory.newFop(MimeConstants.MIME_PDF,out);
            // XSLT transforms XML into XSL-FO; FOP turns those formatting objects into PDF.
            var transformer=TransformerFactory.newInstance().newTransformer(new StreamSource(xslFo));
            transformer.transform(new StreamSource(xml),new SAXResult(fop.getDefaultHandler()));
        }
    }
}
