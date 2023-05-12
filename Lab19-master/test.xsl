<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>Старые открытки</title>
                <meta charset="UTF-8"/>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
            </head>
            <body>
                <div class="container">
                    <h1 class="text-center">Старые открытки</h1>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Тема</th>
                                <th>Тип</th>
                                <th>Отправка</th>
                                <th>Страна</th>
                                <th>Год</th>
                                <th>Автор</th>
                                <th>Ценность</th>
                            </tr>
                        </thead>
                        <tbody>
                            <xsl:apply-templates select="//oldCart"/>
                        </tbody>
                    </table>
                </div>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="oldCart">
        <tr>
            <td><xsl:value-of select="Тема"/></td>
            <td><xsl:value-of select="Тип"/></td>
            <td>
                <xsl:choose>
                    <xsl:when test="Отправка='true'">Отправлено</xsl:when>
                    <xsl:otherwise>Не отправлено</xsl:otherwise>
                </xsl:choose>
            </td>
            <td><xsl:value-of select="Страна"/></td>
            <td><xsl:value-of select="Год"/></td>
            <td><xsl:value-of select="Автор"/></td>
            <td><xsl:value-of select="Ценность"/></td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
