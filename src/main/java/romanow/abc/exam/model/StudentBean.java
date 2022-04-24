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
import romanow.abc.exam.model.AccountBean;
/**
 * StudentBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-24T21:32:27.604+07:00[Asia/Novosibirsk]")
public class StudentBean {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("account")
  private AccountBean account = null;

  @SerializedName("groupId")
  private Long groupId = null;

  public StudentBean id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StudentBean account(AccountBean account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(description = "")
  public AccountBean getAccount() {
    return account;
  }

  public void setAccount(AccountBean account) {
    this.account = account;
  }

  public StudentBean groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @Schema(description = "")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentBean studentBean = (StudentBean) o;
    return Objects.equals(this.id, studentBean.id) &&
        Objects.equals(this.account, studentBean.account) &&
        Objects.equals(this.groupId, studentBean.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, account, groupId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
