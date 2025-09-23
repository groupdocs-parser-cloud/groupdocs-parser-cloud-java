/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Barcode.java">
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

package com.groupdocs.cloud.parser.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.parser.model.BarcodePage;
import com.groupdocs.cloud.parser.model.Rectangle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents an barcode.
 */
@ApiModel(description = "Represents an barcode.")
public class Barcode {
  @SerializedName("codeTypeName")
  private String codeTypeName = null;

  @SerializedName("page")
  private BarcodePage page = null;

  @SerializedName("rectangle")
  private Rectangle rectangle = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("downloadUrl")
  private String downloadUrl = null;

  public Barcode codeTypeName(String codeTypeName) {
    this.codeTypeName = codeTypeName;
    return this;
  }

   /**
   * Gets the name of the barcode type.
   * @return codeTypeName
  **/
  @ApiModelProperty(value = "Gets the name of the barcode type.")
  public String getCodeTypeName() {
    return codeTypeName;
  }

  public void setCodeTypeName(String codeTypeName) {
    this.codeTypeName = codeTypeName;
  }

  public Barcode page(BarcodePage page) {
    this.page = page;
    return this;
  }

   /**
   * Gets the document page information such as page index and page size.
   * @return page
  **/
  @ApiModelProperty(value = "Gets the document page information such as page index and page size.")
  public BarcodePage getPage() {
    return page;
  }

  public void setPage(BarcodePage page) {
    this.page = page;
  }

  public Barcode rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Gets the rectangular area.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Gets the rectangular area.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public Barcode value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Gets the barcode value.
   * @return value
  **/
  @ApiModelProperty(value = "Gets the barcode value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Barcode downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Gets or sets the barcode download URL.
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "Gets or sets the barcode download URL.")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Barcode barcode = (Barcode) o;
    return Objects.equals(this.codeTypeName, barcode.codeTypeName) &&
        Objects.equals(this.page, barcode.page) &&
        Objects.equals(this.rectangle, barcode.rectangle) &&
        Objects.equals(this.value, barcode.value) &&
        Objects.equals(this.downloadUrl, barcode.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeTypeName, page, rectangle, value, downloadUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Barcode {\n");
    
    sb.append("    codeTypeName: ").append(toIndentedString(codeTypeName)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

