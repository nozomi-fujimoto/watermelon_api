package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-25T11:10:44.340894+09:00[Asia/Tokyo]")

public class InlineResponse200   {
  @JsonProperty("combine_fruit")
  private String combineFruit;

  public InlineResponse200 combineFruit(String combineFruit) {
    this.combineFruit = combineFruit;
    return this;
  }

  /**
   * Get combineFruit
   * @return combineFruit
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCombineFruit() {
    return combineFruit;
  }

  public void setCombineFruit(String combineFruit) {
    this.combineFruit = combineFruit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.combineFruit, inlineResponse200.combineFruit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combineFruit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    combineFruit: ").append(toIndentedString(combineFruit)).append("\n");
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

