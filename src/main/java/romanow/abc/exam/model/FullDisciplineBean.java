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
import java.util.ArrayList;
import java.util.List;
import romanow.abc.exam.model.FullThemeBean;

/**
 * FullDisciplineBean
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2022-04-22T11:27:57.635+07:00[Asia/Novosibirsk]")
public class FullDisciplineBean {

  @SerializedName("id")
  private Long id = null;
  
  @SerializedName("name")
  private String name = null;
  
  @SerializedName("themes")
  private List<FullThemeBean> themes = null;
  
  public FullDisciplineBean id(Long id) {
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
  
  public FullDisciplineBean name(String name) {
    this.name = name;
    return this;
  }

  
  /**
  * Get name
  * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
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
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, fullDisciplineBean.id) &&
        Objects.equals(this.name, fullDisciplineBean.name) &&
        Objects.equals(this.themes, fullDisciplineBean.themes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, themes);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullDisciplineBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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



