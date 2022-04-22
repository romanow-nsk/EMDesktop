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
 * StudentTaskBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-04-22T11:27:57.635+07:00[Asia/Novosibirsk]")
public class StudentTaskBean {

  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("text")
  private String text = null;
  
  @SerializedName("artefactId")
  private Long artefactId = null;
  
  /**
   * Gets or Sets taskType
   */
  @JsonAdapter(TaskTypeEnum.Adapter.class)
  public enum TaskTypeEnum {
    
    QUESTION("QUESTION"),
    EXERCISE("EXERCISE");

    private String value;

    TaskTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static TaskTypeEnum fromValue(String text) {
      for (TaskTypeEnum b : TaskTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<TaskTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaskTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaskTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TaskTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("taskType")
  private TaskTypeEnum taskType = null;
  
  @SerializedName("themeName")
  private String themeName = null;
  
  public StudentTaskBean id(Long id) {
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
  
  public StudentTaskBean text(String text) {
    this.text = text;
    return this;
  }

  
  /**
  * Get text
  * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  
  public StudentTaskBean artefactId(Long artefactId) {
    this.artefactId = artefactId;
    return this;
  }

  
  /**
  * Get artefactId
  * @return artefactId
  **/
  @ApiModelProperty(value = "")
  public Long getArtefactId() {
    return artefactId;
  }
  public void setArtefactId(Long artefactId) {
    this.artefactId = artefactId;
  }
  
  public StudentTaskBean taskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
    return this;
  }

  
  /**
  * Get taskType
  * @return taskType
  **/
  @ApiModelProperty(value = "")
  public TaskTypeEnum getTaskType() {
    return taskType;
  }
  public void setTaskType(TaskTypeEnum taskType) {
    this.taskType = taskType;
  }
  
  public StudentTaskBean themeName(String themeName) {
    this.themeName = themeName;
    return this;
  }

  
  /**
  * Get themeName
  * @return themeName
  **/
  @ApiModelProperty(value = "")
  public String getThemeName() {
    return themeName;
  }
  public void setThemeName(String themeName) {
    this.themeName = themeName;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentTaskBean studentTaskBean = (StudentTaskBean) o;
    return Objects.equals(this.id, studentTaskBean.id) &&
        Objects.equals(this.text, studentTaskBean.text) &&
        Objects.equals(this.artefactId, studentTaskBean.artefactId) &&
        Objects.equals(this.taskType, studentTaskBean.taskType) &&
        Objects.equals(this.themeName, studentTaskBean.themeName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, text, artefactId, taskType, themeName);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentTaskBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    artefactId: ").append(toIndentedString(artefactId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    themeName: ").append(toIndentedString(themeName)).append("\n");
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



