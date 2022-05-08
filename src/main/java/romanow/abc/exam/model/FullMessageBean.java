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
import romanow.abc.exam.model.ArtefactBean;
import romanow.abc.exam.model.MessageBean;
/**
 * FullMessageBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-08T18:16:36.953+07:00[Asia/Novosibirsk]")
public class FullMessageBean {
  @SerializedName("message")
  private MessageBean message = null;

  @SerializedName("artefact")
  private ArtefactBean artefact = null;

  @SerializedName("account")
  private AccountBean account = null;

  public FullMessageBean message(MessageBean message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public MessageBean getMessage() {
    return message;
  }

  public void setMessage(MessageBean message) {
    this.message = message;
  }

  public FullMessageBean artefact(ArtefactBean artefact) {
    this.artefact = artefact;
    return this;
  }

   /**
   * Get artefact
   * @return artefact
  **/
  @Schema(description = "")
  public ArtefactBean getArtefact() {
    return artefact;
  }

  public void setArtefact(ArtefactBean artefact) {
    this.artefact = artefact;
  }

  public FullMessageBean account(AccountBean account) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullMessageBean fullMessageBean = (FullMessageBean) o;
    return Objects.equals(this.message, fullMessageBean.message) &&
        Objects.equals(this.artefact, fullMessageBean.artefact) &&
        Objects.equals(this.account, fullMessageBean.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, artefact, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullMessageBean {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    artefact: ").append(toIndentedString(artefact)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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