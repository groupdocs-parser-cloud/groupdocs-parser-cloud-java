![](https://img.shields.io/badge/api-v1.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/groupdocs-parser-cloud/groupdocs-parser-cloud-java)](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-java/blob/master/LICENSE)

# GroupDocs.Parser Cloud SDK for Java
This repository contains GroupDocs.Parser Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Parser Cloud REST APIs in your Java applications.

## Cloud Document Parser Features

- Create easy to define templates with a data field and table definitions.
- Parse documents with pre-defined templates.
- Extract data from invoices or from other sorts of documents.
- Supports extracting text and images.
- Extract data from regular documents as well as from email or archive containers.
- Obtain data from PDF portfolios.
- Fetch text fields, numbers, and tables from common documents.
- Save your templates in the storage and parse your documents with them.
- Ability to extract HTML or Markdown (MD) text for a quick preview.
- Fetch specific pages of plain as well as formatted text.
- Extract formatted (bold, italic, hyperlink, etc.) text in the MD format.
- Support for extracting text in HTML formatting (paragraph, hyperlinks, lists, etc.).
- Retrieve all images from a document and save them.
- Obtain basic information about documents, archives, emails, and attachments, etc.
- Extract data from a document contained inside a ZIP archive, email, or PDF portfolio.


## Parse Document By Template Supported Formats

- Word Processing: DOC, DOT, DOCX, DOCM, DOTX, DOTM, ODT, OTT, RTF
- Spreadsheet: XLS, XLT, XLSX, XLSM, XLSB, XLTX, XLTM, ODS, OTS, CSV, XLA, XLAM, NUMBERS
- Presentation: PPT, PPS, POT, PPTX, PPTM, POTX, POTM, PPSX, PPSM, ODP, OTP
- Portable: PDF

## Extract Text Supported Formats

- Word Processing: DOC, DOT, DOCX, DOCM, DOTX, DOTM, TXT, ODT, OTT, RTF
- Spreadsheet: XLS, XLT, XLSX, XLSM, XLSB, XLTX, XLTM, ODS, OTS, CSV, XLA, XLAM, NUMBERS
- Presentation: PPT, PPS, POT, PPTX, PPTM, POTX, POTM, PPSX, PPSM, ODP, OTP
- Portable: PDF
- Markup: HTML, XHTML, MHTML, MD, XML
- eBook: CHM, EPUB, FB2
- Emails: EML, EMLX, MSG
- Notes: ONE

## Extract Document Info Supported Formats

- Word Processing: DOC, DOT, DOCX, DOCM, DOTX, DOTM, TXT, ODT, OTT, RTF
- Spreadsheet: XLS, XLT, XLSX, XLSM, XLSB, XLTX, XLTM, ODS, OTS, CSV, XLA, XLAM, NUMBERS
- Presentation: PPT, PPS, POT, PPTX, PPTM, POTX, POTM, PPSX, PPSM, ODP, OTP
- Portable: PDF
- Markup: HTML, XHTML, MHTML, MD, XML
- eBook: CHM, EPUB, FB2
- Emails: PST, OST, EML, EMLX, MSG
- Notes: ONE
- Archives: ZIP

## Extract Images Supported Formats

- Word Processing: DOC, DOT, DOCX, DOCM, DOTX, DOTM, TXT, ODT, OTT, RTF
- Spreadsheet: XLS, XLT, XLSX, XLSM, XLSB, XLTX, XLTM, ODS, OTS, CSV, XLA, XLAM, NUMBERS
- Presentation: PPT, PPS, POT, PPTX, PPTM, POTX, POTM, PPSX, PPSM, ODP, OTP
- Portable: PDF
- Emails: EML, EMLX, MSG
- Ar5chives: ZIP

## Extract Container Items Info Supported Formats

- Portable: PDF
- Emails: PST, OST, EML, EMLX, MSG
- Archives: ZIP

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-parser-cloud</artifactId>
    <version>20.6</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/groupdocs-parser-cloud-20.6.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.groupdocs.cloud.parser.client.*;
import com.groupdocs.cloud.parser.model.*;
import com.groupdocs.cloud.parser.api.InfoApi;

import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(appSid, appKey);

        InfoApi infoApi = new InfoApi(configuration);

        try {
            FormatsResult response = infoApi.getSupportedFileFormats();
            for (Format format : response.getFormats()) {
                System.out.println(format.getFileFormat());
            }
        } catch (ApiException e) {
            System.err.println("Failed to get supported file formats");
            e.printStackTrace();
        }
    }
}
```

## Licensing
All GroupDocs.Parser Cloud SDKs are licensed under [MIT License](LICENSE).
## GroupDocs.Parser Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Android |
|---|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-dotnet) | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-java) | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-php) | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-python) | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-ruby)  | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-node) | [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-android) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.parser-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-parser-cloud) | [Composer](https://packagist.org/packages/groupdocscloud/groupdocs-parser-cloud) | [PIP](https://pypi.org/project/groupdocs-parser-cloud/) | [GEM](https://rubygems.org/gems/groupdocs_parser_cloud)  | [NPM](https://www.npmjs.com/package/groupdocs-parser-cloud) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-parser-cloud-android) |


[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/parser/java) | [Docs](https://docs.groupdocs.cloud/parser/) | [Demos](https://products.groupdocs.app/parser/family) | [API Reference](https://apireference.groupdocs.cloud/parser/) | [Examples](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-java-samples) | [Blog](https://blog.groupdocs.cloud/category/parser/) | [Free Support](https://forum.groupdocs.cloud/c/parser) | [Free Trial](https://purchase.groupdocs.cloud/trial)
