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
