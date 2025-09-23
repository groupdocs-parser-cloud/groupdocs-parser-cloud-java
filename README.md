# GroupDocs.Parser Cloud SDK for Java

This repository contains GroupDocs.Parser Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Parser Cloud REST APIs in your Java applications

## Requirements

* Java SE Development Kit 8

## Installation

### Maven

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
    <version>25.9</version>
    <scope>compile</scope>
</dependency>
```

### Gradle

Add following repository and dependency to your build.gradle:

```javascript
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-parser-cloud:25.9'
}
```

## Getting Started

* Please follow the [installation](#installation) instruction
* Get your AppSID and AppKey at [Dashboard](https://dashboard.groupdocs.cloud) and use them in your code
* Build and execute
* Explore more samples at [GitHub](https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-java-samples)

Below is an example demonstrating how to extract images from a PDF Portfolio using GroupDocs.Parser Cloud SDK for Java:

```java
// Get AppKey and AppSID from https://dashboard.groupdocs.cloud
String MyAppKey = "";
String MyAppSid = "";

Configuration configuration = new Configuration(MyAppSid, MyAppKey);
ParseApi apiInstance = new ParseApi(configuration);

FileInfo fileInfo = new FileInfo();
fileInfo.setFilePath("pdf/PDF with attachments.pdf");
fileInfo.setPassword("password");

ContainerItemInfo containerItemInfo = new ContainerItemInfo();
containerItemInfo.setRelativePath("template-document.pdf");

ImagesOptions options = new ImagesOptions();
options.setFileInfo(fileInfo);
options.setContainerItemInfo(containerItemInfo);

ImagesRequest request = new ImagesRequest(options);
ImagesResult response = apiInstance.images(request);

// For complete examples and data files, visit https://github.com/groupdocs-parser-cloud/groupdocs-parser-cloud-java-samples
```

## Manual build and installation from sources

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.
Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

At first generate the JAR by executing following command in "/src" working directory:

```shell
mvn package -D maven.test.skip=true
```

Then manually install the following JARs:

* target/groupdocs-parser-cloud-25.9.jar
* target/lib/*.jar

## Licensing

All GroupDocs.Parser Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

* [**Website**](https://www.groupdocs.cloud)
* [**Product Home**](https://products.groupdocs.cloud/parser)
* [**Documentation**](https://docs.groupdocs.cloud/parser/)
* [**Free Support Forum**](https://forum.groupdocs.cloud/c/parser)
* [**Blog**](https://blog.groupdocs.cloud/category/parser)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/parser).
