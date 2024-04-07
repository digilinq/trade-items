<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
      xmlns:xsd="http://www.w3.org/2001/XMLSchema">

    <xsl:output method="text" indent="no"/>

    <xsl:template match="/">
        <xsl:text>gs1.version=</xsl:text>
        <xsl:value-of select="/xsd:schema/@version"/>
    </xsl:template>
</xsl:stylesheet>
