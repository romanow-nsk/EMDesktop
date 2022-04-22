/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package romanow.abc.exam.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtefactBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-04-22T11:27:57.635+07:00[Asia/Novosibirsk]")
public class ArtefactBean {

  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("fileSize")
  private Long fileSize = null;
  
  /**
   * Gets or Sets artefactType
   */
  @JsonAdapter(ArtefactTypeEnum.Adapter.class)
  public enum ArtefactTypeEnum {
    
    PNG("PNG"),
    JPG("JPG"),
    JPEG("JPEG"),
    XML("XML"),
    DOC("DOC"),
    DOCX("DOCX"),
    PDF("PDF");

    private String value;

    ArtefactTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static ArtefactTypeEnum fromValue(String text) {
      for (ArtefactTypeEnum b : ArtefactTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<ArtefactTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArtefactTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArtefactTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ArtefactTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("artefactType")
  private ArtefactTypeEnum artefactType = null;
  
  @SerializedName("fileName")
  private String fileName = null;
  
  public ArtefactBean id(Long id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  
  public ArtefactBean fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  
  /**
  * Get fileSize
  * @return fileSize
  **/
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }
  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }
  
  public ArtefactBean artefactType(ArtefactTypeEnum artefactType) {
    this.artefactType = artefactType;
    return this;
  }

  
  /**
  * Get artefactType
  * @return artefactType
  **/
  @ApiModelProperty(value = "")
  public ArtefactTypeEnum getArtefactType() {
    return artefactType;
  }
  public void setArtefactType(ArtefactTypeEnum artefactType) {
    this.artefactType = artefactType;
  }
  
  public ArtefactBean fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  
  /**
  * Get fileName
  * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtefactBean artefactBean = (ArtefactBean) o;
    return Objects.equals(this.id, artefactBean.id) &&
        Objects.equals(this.fileSize, artefactBean.fileSize) &&
        Objects.equals(this.artefactType, artefactBean.artefactType) &&
        Objects.equals(this.fileName, artefactBean.fileName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, fileSize, artefactType, fileName);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtefactBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    artefactType: ").append(toIndentedString(artefactType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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



