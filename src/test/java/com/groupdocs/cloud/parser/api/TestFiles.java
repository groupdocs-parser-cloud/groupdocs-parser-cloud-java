/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.parser.api;

import java.util.ArrayList;

public class TestFiles {

    public static TestFile PasswordProtected = new TestFile("password-protected.docx", "words\\docx\\");
    public static TestFile FourPages = new TestFile("four-pages.docx", "words\\docx\\");
    public static TestFile OnePage = new TestFile("one-page.docx", "words\\docx\\");
    public static TestFile TemplateDocumentDocx = new TestFile("template-document.docx", "words\\docx\\");
    public static TestFile FormattedDocument = new TestFile("formatted-document.docx", "words\\docx\\");
    public static TestFile EncodingDetection = new TestFile("encoding-detection.txt", "words\\txt\\");
    public static TestFile Zip = new TestFile("docx.zip", "containers\\archive\\");
    public static TestFile Rar = new TestFile("sample.rar", "containers\\archive\\");
    public static TestFile Tar = new TestFile("sample.tar", "containers\\archive\\");
    public static TestFile Md = new TestFile("sample.md", "words\\docx\\");
    public static TestFile ZipWithEmailImagePdf = new TestFile("zip-eml-jpg-pdf.zip", "containers\\archive\\");
    public static TestFile JpegFile = new TestFile("document.jpeg", "image\\jpeg\\");
    public static TestFile ImageAndAttachment = new TestFile("embedded-image-and-attachment.eml", "email\\eml\\");
    public static TestFile PdfContainer = new TestFile("PDF with attachements.pdf", "pdf\\");
    public static TestFile Pdf = new TestFile("template-document.pdf", "pdf\\");
    public static TestFile NotExist = new TestFile("NotExist.docx", "folder/");
    public static TestFile Video = new TestFile("sample.avi", "video\\avi\\");
    public static TestFile Barcodes = new TestFile("barcodes.docx", "words\\docx\\");
   
    
    static {
        PasswordProtected.setPassword("password");
        PdfContainer.setPassword("password");
    }

    public static ArrayList<TestFile> GetList() {
        
        ArrayList<TestFile> files = new ArrayList<TestFile>();
        files.add(PasswordProtected);
        files.add(FourPages);
        files.add(OnePage);
        files.add(TemplateDocumentDocx);
        files.add(FormattedDocument);
        files.add(EncodingDetection);
        files.add(Zip);
        files.add(ZipWithEmailImagePdf);
        files.add(JpegFile);
        files.add(ImageAndAttachment);
        files.add(Pdf);
        files.add(PdfContainer);
        files.add(Rar);
        files.add(Tar);
        files.add(Md);
        return files; 
    } 
}