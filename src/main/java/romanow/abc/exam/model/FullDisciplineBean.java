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
import romanow.abc.exam.model.DisciplineBean;
import romanow.abc.exam.model.FullThemeBean;
/**
 * FullDisciplineBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-23T18:50:52.264+07:00[Asia/Novosibirsk]")
public class FullDisciplineBean {
  @SerializedName("discipline")
  private DisciplineBean discipline = null;

  @SerializedName("themes")
  private List<FullThemeBean> themes = null;

  public FullDisciplineBean discipline(DisciplineBean discipline) {
    this.discipline = discipline;
    return this;
  }

   /**
   * Get discipline
   * @return discipline
  **/
  @Schema(description = "")
  public DisciplineBean getDiscipline() {
    return discipline;
  }

  public void setDiscipline(DisciplineBean discipline) {
    this.discipline = discipline;
  }

  public FullDisciplineBean themes(List<FullThemeBean> themes) {
    this.themes = themes;
    return this;
  }

  public FullDisciplineBean addThemesItem(FullThemeBean themesItem) {
    if (this.themes == null) {
      this.themes = new ArrayList<FullThemeBean>();
    }
    this.themes.add(themesItem);
    return this;
  }

   /**
   * Get themes
   * @return themes
  **/
  @Schema(description = "")
  public List<FullThemeBean> getThemes() {
    return themes;
  }

  public void setThemes(List<FullThemeBean> themes) {
    this.themes = themes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullDisciplineBean fullDisciplineBean = (FullDisciplineBean) o;
    return Objects.equals(this.discipline, fullDisciplineBean.discipline) &&
        Objects.equals(this.themes, fullDisciplineBean.themes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discipline, themes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullDisciplineBean {\n");
    
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
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
