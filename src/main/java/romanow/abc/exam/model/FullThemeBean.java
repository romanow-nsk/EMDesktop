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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import romanow.abc.exam.model.FullTaskBean;
import romanow.abc.exam.model.ThemeBean;
/**
 * FullThemeBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-24T21:32:27.604+07:00[Asia/Novosibirsk]")
public class FullThemeBean {
  @SerializedName("theme")
  private ThemeBean theme = null;

  @SerializedName("tasks")
  private List<FullTaskBean> tasks = null;

  public FullThemeBean theme(ThemeBean theme) {
    this.theme = theme;
    return this;
  }

   /**
   * Get theme
   * @return theme
  **/
  @Schema(description = "")
  public ThemeBean getTheme() {
    return theme;
  }

  public void setTheme(ThemeBean theme) {
    this.theme = theme;
  }

  public FullThemeBean tasks(List<FullTaskBean> tasks) {
    this.tasks = tasks;
    return this;
  }

  public FullThemeBean addTasksItem(FullTaskBean tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<FullTaskBean>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @Schema(description = "")
  public List<FullTaskBean> getTasks() {
    return tasks;
  }

  public void setTasks(List<FullTaskBean> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullThemeBean fullThemeBean = (FullThemeBean) o;
    return Objects.equals(this.theme, fullThemeBean.theme) &&
        Objects.equals(this.tasks, fullThemeBean.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, tasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullThemeBean {\n");
    
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
