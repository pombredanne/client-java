/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.v1alpha1.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.grafeas.v1alpha1.model.Distribution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.
 */
@ApiModel(description = "This represents a particular package that is distributed over various channels. e.g. glibc (aka libc6) is distributed by many, at various versions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T18:21:51.795-04:00")
public class ModelPackage   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("distribution")
  private List<Distribution> distribution = new ArrayList<Distribution>();

  public ModelPackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the package.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the package.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelPackage distribution(List<Distribution> distribution) {
    this.distribution = distribution;
    return this;
  }

  public ModelPackage addDistributionItem(Distribution distributionItem) {
    this.distribution.add(distributionItem);
    return this;
  }

   /**
   * The various channels by which a package is distributed.
   * @return distribution
  **/
  @ApiModelProperty(example = "null", value = "The various channels by which a package is distributed.")
  public List<Distribution> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<Distribution> distribution) {
    this.distribution = distribution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.name, _package.name) &&
        Objects.equals(this.distribution, _package.distribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, distribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
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

