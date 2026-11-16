# Task 2 — JAX-WS SOAP Service and XSL Transformation

**Implemented in source:** annotated JAX-WS SOAP service, endpoint publisher, Student/Subject bean model, XML-to-HTML XSLT, XML-to-PDF XSL-FO transformation using Apache FOP, and a JUnit test for XSLT.

## Run the SOAP service
1. Open this folder as a Maven project in IntelliJ and wait for dependency sync.
2. Run `com.webservices.Main`.
3. Keep it running. Visit `http://localhost:8081/student?wsdl` to inspect the generated WSDL.
4. In SoapUI, create a SOAP project using that WSDL URL. Test `getStudent` and `serviceStatus`.

## wsimport client
The old `wsimport` executable is not bundled with JDK 11+. The service must be running. Use a compatible Metro 2.3.x `wsimport` tool distribution against `http://localhost:8081/student?wsdl`, or configure the Metro Maven wsimport plugin with that WSDL URL. Then compile and run a small client using the generated service/port classes. Keep screenshots of the generated client and successful invocation for assessment evidence.

## XSL transformations
- HTML: call `new XslTransformer().transform(xml, stylesheet, output)` using `student.xml`, `student-to-html.xsl`, and `student.html`.
- PDF: call `new PdfTransformer().transform(xml, xslFo, pdf)` using `student.xml`, `student-to-pdf.xsl`, and `student.pdf`.

Maven tool window → Lifecycle → `test` runs tests. Maven goal `javadoc:javadoc` generates JavaDoc.

**External-tool evidence still required:** SoapUI WSDL import and requests, plus the wsimport-generated client test. The assignment sheet explicitly asks for these demonstrations.
