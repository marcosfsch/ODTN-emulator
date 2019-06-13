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
import io.swagger.model.TapiPhotonicMediaApplicationIdentifier;
import io.swagger.model.TapiPhotonicMediaCentralFrequency;
import io.swagger.model.TapiPhotonicMediaLaserPropertiesPac;
import io.swagger.model.TapiPhotonicMediaPowerPropertiesPac;
import io.swagger.model.TapiPhotonicMediaSelectedModulation;
import io.swagger.model.TapiPhotonicMediaSpectrumBand;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaOtsiTerminationPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaOtsiTerminationPac   {
  @JsonProperty("selected-application-identifier")
  private TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier = null;

  @JsonProperty("received-power")
  private TapiPhotonicMediaPowerPropertiesPac receivedPower = null;

  @JsonProperty("selected-central-frequency")
  private TapiPhotonicMediaCentralFrequency selectedCentralFrequency = null;

  @JsonProperty("transmited-power")
  private TapiPhotonicMediaPowerPropertiesPac transmitedPower = null;

  @JsonProperty("selected-modulation")
  private TapiPhotonicMediaSelectedModulation selectedModulation = null;

  @JsonProperty("laser-properties")
  private TapiPhotonicMediaLaserPropertiesPac laserProperties = null;

  @JsonProperty("selected-spectrum")
  private TapiPhotonicMediaSpectrumBand selectedSpectrum = null;

  public TapiPhotonicMediaOtsiTerminationPac selectedApplicationIdentifier(TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier) {
    this.selectedApplicationIdentifier = selectedApplicationIdentifier;
    return this;
  }

  /**
   * This attribute indicates the selected Application Identifier that is used by the OCh trail termination function. The syntax of ApplicationIdentifier is a pair {ApplicationIdentifierType, PrintableString}. The value of ApplicationIdentifierType is either STANDARD or PROPRIETARY. The value of PrintableString represents the standard application code as defined in the ITU-T Recommendations or a vendor-specific proprietary code. If the ApplicationIdentifierType is STANDARD the value of PrintableString represents a standard application code as defined in the ITU-T Recommendations. If the ApplicationIdentifierType is PROPRIETARY, the first six characters of the PrintableString must contain the Hexadecimal representation of an OUI assigned to the vendor whose implementation generated the Application Identifier; the remaining octets of the PrintableString are unspecified. The value of this attribute of an object instance has to be one of the values identified in the attribute SupportableApplicationIdentifierList of the same object instance. The values and value ranges of the optical interface parameters of a standard application code must be consistent with those values specified in the ITU-T Recommendation for that application code.
   * @return selectedApplicationIdentifier
   **/
  @JsonProperty("selected-application-identifier")
  @ApiModelProperty(value = "This attribute indicates the selected Application Identifier that is used by the OCh trail termination function. The syntax of ApplicationIdentifier is a pair {ApplicationIdentifierType, PrintableString}. The value of ApplicationIdentifierType is either STANDARD or PROPRIETARY. The value of PrintableString represents the standard application code as defined in the ITU-T Recommendations or a vendor-specific proprietary code. If the ApplicationIdentifierType is STANDARD the value of PrintableString represents a standard application code as defined in the ITU-T Recommendations. If the ApplicationIdentifierType is PROPRIETARY, the first six characters of the PrintableString must contain the Hexadecimal representation of an OUI assigned to the vendor whose implementation generated the Application Identifier; the remaining octets of the PrintableString are unspecified. The value of this attribute of an object instance has to be one of the values identified in the attribute SupportableApplicationIdentifierList of the same object instance. The values and value ranges of the optical interface parameters of a standard application code must be consistent with those values specified in the ITU-T Recommendation for that application code.")
  public TapiPhotonicMediaApplicationIdentifier getSelectedApplicationIdentifier() {
    return selectedApplicationIdentifier;
  }

  public void setSelectedApplicationIdentifier(TapiPhotonicMediaApplicationIdentifier selectedApplicationIdentifier) {
    this.selectedApplicationIdentifier = selectedApplicationIdentifier;
  }

  public TapiPhotonicMediaOtsiTerminationPac receivedPower(TapiPhotonicMediaPowerPropertiesPac receivedPower) {
    this.receivedPower = receivedPower;
    return this;
  }

  /**
   * none
   * @return receivedPower
   **/
  @JsonProperty("received-power")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaPowerPropertiesPac getReceivedPower() {
    return receivedPower;
  }

  public void setReceivedPower(TapiPhotonicMediaPowerPropertiesPac receivedPower) {
    this.receivedPower = receivedPower;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedCentralFrequency(TapiPhotonicMediaCentralFrequency selectedCentralFrequency) {
    this.selectedCentralFrequency = selectedCentralFrequency;
    return this;
  }

  /**
   * none
   * @return selectedCentralFrequency
   **/
  @JsonProperty("selected-central-frequency")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaCentralFrequency getSelectedCentralFrequency() {
    return selectedCentralFrequency;
  }

  public void setSelectedCentralFrequency(TapiPhotonicMediaCentralFrequency selectedCentralFrequency) {
    this.selectedCentralFrequency = selectedCentralFrequency;
  }

  public TapiPhotonicMediaOtsiTerminationPac transmitedPower(TapiPhotonicMediaPowerPropertiesPac transmitedPower) {
    this.transmitedPower = transmitedPower;
    return this;
  }

  /**
   * Measured power at the Transmitter.
   * @return transmitedPower
   **/
  @JsonProperty("transmited-power")
  @ApiModelProperty(value = "Measured power at the Transmitter.")
  public TapiPhotonicMediaPowerPropertiesPac getTransmitedPower() {
    return transmitedPower;
  }

  public void setTransmitedPower(TapiPhotonicMediaPowerPropertiesPac transmitedPower) {
    this.transmitedPower = transmitedPower;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedModulation(TapiPhotonicMediaSelectedModulation selectedModulation) {
    this.selectedModulation = selectedModulation;
    return this;
  }

  /**
   * This parameter defines the modulation used at the source
   * @return selectedModulation
   **/
  @JsonProperty("selected-modulation")
  @ApiModelProperty(value = "This parameter defines the modulation used at the source")
  public TapiPhotonicMediaSelectedModulation getSelectedModulation() {
    return selectedModulation;
  }

  public void setSelectedModulation(TapiPhotonicMediaSelectedModulation selectedModulation) {
    this.selectedModulation = selectedModulation;
  }

  public TapiPhotonicMediaOtsiTerminationPac laserProperties(TapiPhotonicMediaLaserPropertiesPac laserProperties) {
    this.laserProperties = laserProperties;
    return this;
  }

  /**
   * Laser properties.
   * @return laserProperties
   **/
  @JsonProperty("laser-properties")
  @ApiModelProperty(value = "Laser properties.")
  public TapiPhotonicMediaLaserPropertiesPac getLaserProperties() {
    return laserProperties;
  }

  public void setLaserProperties(TapiPhotonicMediaLaserPropertiesPac laserProperties) {
    this.laserProperties = laserProperties;
  }

  public TapiPhotonicMediaOtsiTerminationPac selectedSpectrum(TapiPhotonicMediaSpectrumBand selectedSpectrum) {
    this.selectedSpectrum = selectedSpectrum;
    return this;
  }

  /**
   * none
   * @return selectedSpectrum
   **/
  @JsonProperty("selected-spectrum")
  @ApiModelProperty(value = "none")
  public TapiPhotonicMediaSpectrumBand getSelectedSpectrum() {
    return selectedSpectrum;
  }

  public void setSelectedSpectrum(TapiPhotonicMediaSpectrumBand selectedSpectrum) {
    this.selectedSpectrum = selectedSpectrum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaOtsiTerminationPac tapiPhotonicMediaOtsiTerminationPac = (TapiPhotonicMediaOtsiTerminationPac) o;
    return Objects.equals(this.selectedApplicationIdentifier, tapiPhotonicMediaOtsiTerminationPac.selectedApplicationIdentifier) &&
        Objects.equals(this.receivedPower, tapiPhotonicMediaOtsiTerminationPac.receivedPower) &&
        Objects.equals(this.selectedCentralFrequency, tapiPhotonicMediaOtsiTerminationPac.selectedCentralFrequency) &&
        Objects.equals(this.transmitedPower, tapiPhotonicMediaOtsiTerminationPac.transmitedPower) &&
        Objects.equals(this.selectedModulation, tapiPhotonicMediaOtsiTerminationPac.selectedModulation) &&
        Objects.equals(this.laserProperties, tapiPhotonicMediaOtsiTerminationPac.laserProperties) &&
        Objects.equals(this.selectedSpectrum, tapiPhotonicMediaOtsiTerminationPac.selectedSpectrum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selectedApplicationIdentifier, receivedPower, selectedCentralFrequency, transmitedPower, selectedModulation, laserProperties, selectedSpectrum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaOtsiTerminationPac {\n");
    
    sb.append("    selectedApplicationIdentifier: ").append(toIndentedString(selectedApplicationIdentifier)).append("\n");
    sb.append("    receivedPower: ").append(toIndentedString(receivedPower)).append("\n");
    sb.append("    selectedCentralFrequency: ").append(toIndentedString(selectedCentralFrequency)).append("\n");
    sb.append("    transmitedPower: ").append(toIndentedString(transmitedPower)).append("\n");
    sb.append("    selectedModulation: ").append(toIndentedString(selectedModulation)).append("\n");
    sb.append("    laserProperties: ").append(toIndentedString(laserProperties)).append("\n");
    sb.append("    selectedSpectrum: ").append(toIndentedString(selectedSpectrum)).append("\n");
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
