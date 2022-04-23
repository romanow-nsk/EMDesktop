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
/**
 * MessageBean
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-23T18:50:52.264+07:00[Asia/Novosibirsk]")
public class MessageBean {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("sendTime")
  private Long sendTime = null;

  @SerializedName("artefactId")
  private Long artefactId = null;

  @SerializedName("accountId")
  private Long accountId = null;

  public MessageBean id(Long id) {
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

  public MessageBean text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageBean sendTime(Long sendTime) {
    this.sendTime = sendTime;
    return this;
  }

   /**
   * Get sendTime
   * @return sendTime
  **/
  @Schema(description = "")
  public Long getSendTime() {
    return sendTime;
  }

  public void setSendTime(Long sendTime) {
    this.sendTime = sendTime;
  }

  public MessageBean artefactId(Long artefactId) {
    this.artefactId = artefactId;
    return this;
  }

   /**
   * Get artefactId
   * @return artefactId
  **/
  @Schema(description = "")
  public Long getArtefactId() {
    return artefactId;
  }

  public void setArtefactId(Long artefactId) {
    this.artefactId = artefactId;
  }

  public MessageBean accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(description = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageBean messageBean = (MessageBean) o;
    return Objects.equals(this.id, messageBean.id) &&
        Objects.equals(this.text, messageBean.text) &&
        Objects.equals(this.sendTime, messageBean.sendTime) &&
        Objects.equals(this.artefactId, messageBean.artefactId) &&
        Objects.equals(this.accountId, messageBean.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, sendTime, artefactId, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    artefactId: ").append(toIndentedString(artefactId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
