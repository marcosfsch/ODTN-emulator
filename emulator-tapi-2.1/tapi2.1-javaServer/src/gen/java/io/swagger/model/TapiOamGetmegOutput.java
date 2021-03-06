/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiOamMeg;
import javax.validation.constraints.*;

/**
 * TapiOamGetmegOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOamGetmegOutput   {
  @JsonProperty("meg")
  private TapiOamMeg meg = null;

  public TapiOamGetmegOutput meg(TapiOamMeg meg) {
    this.meg = meg;
    return this;
  }

  /**
   * none
   * @return meg
   **/
  @JsonProperty("meg")
  @ApiModelProperty(value = "none")
  public TapiOamMeg getMeg() {
    return meg;
  }

  public void setMeg(TapiOamMeg meg) {
    this.meg = meg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOamGetmegOutput tapiOamGetmegOutput = (TapiOamGetmegOutput) o;
    return Objects.equals(this.meg, tapiOamGetmegOutput.meg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOamGetmegOutput {\n");
    
    sb.append("    meg: ").append(toIndentedString(meg)).append("\n");
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

