<?xml version="1.0" encoding="UTF-8"?>
<!-- XSL-FO namespace describes printable page layout and formatting. -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
<xsl:template match="/student"><fo:root>
<fo:layout-master-set><fo:simple-page-master master-name="page" page-height="29.7cm" page-width="21cm" margin="2cm"><fo:region-body/></fo:simple-page-master></fo:layout-master-set>
<fo:page-sequence master-reference="page"><fo:flow flow-name="xsl-region-body">
<fo:block font-size="18pt" font-weight="bold" space-after="12pt">Student information</fo:block>
<fo:block>ID: <xsl:value-of select="id"/></fo:block><fo:block>Name: <xsl:value-of select="name"/></fo:block>
<fo:block>Age: <xsl:value-of select="age"/></fo:block><fo:block>Average grade: <xsl:value-of select="averageGrade"/></fo:block>
<fo:block font-size="14pt" font-weight="bold" space-before="12pt">Subjects</fo:block>
<xsl:for-each select="subjects/subject"><fo:block><xsl:value-of select="name"/> — grade <xsl:value-of select="grade"/></fo:block></xsl:for-each>
</fo:flow></fo:page-sequence></fo:root></xsl:template></xsl:stylesheet>
