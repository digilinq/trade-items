<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsd="http://www.w3.org/2001/XMLSchema">
    <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <properties>
            <xsd-version>
                <xsl:value-of select="/xsd:schema/@version"/>
            </xsd-version>
        </properties>
    </xsl:template>
</xsl:stylesheet>
