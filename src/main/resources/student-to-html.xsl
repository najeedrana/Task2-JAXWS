<?xml version="1.0" encoding="UTF-8"?>
<!-- XSLT stylesheet: maps XML nodes into HTML elements shown to an end-user. -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" indent="yes"/>
<xsl:template match="/student">
<html><head><title>Student information</title></head><body>
<h1>Student information</h1>
<p>ID: <xsl:value-of select="id"/></p><p>Name: <xsl:value-of select="name"/></p>
<p>Age: <xsl:value-of select="age"/></p><p>Average grade: <xsl:value-of select="averageGrade"/></p>
<h2>Subjects</h2><ul><xsl:for-each select="subjects/subject"><li>
<xsl:value-of select="name"/> — grade <xsl:value-of select="grade"/>
</li></xsl:for-each></ul>
</body></html>
</xsl:template></xsl:stylesheet>
