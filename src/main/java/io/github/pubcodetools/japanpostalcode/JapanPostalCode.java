/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.pubcodetools.japanpostalcode;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JapanPostalCode {
  @JsonProperty("postalCode")
  private String postalCode;

  @JsonProperty("prefecture")
  private String prefecture;

  @JsonProperty("city")
  private String city;

  @JsonProperty("street")
  private String street;

  public String getPostalCode() {
    return postalCode;
  }

  public String getPrefecture() {
    return prefecture;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  /**
   * Convert JapanPostalCode to String.
   * @return serialized JapanPostalCode
   */
  public String toString() {
    return "postalCode: "
        + postalCode
        + "\n"
        + "prefecture: "
        + prefecture
        + "\n"
        + "city: "
        + city
        + "\n"
        + "street: "
        + street
        + "\n";
  }
}
