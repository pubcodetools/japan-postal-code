package io.github.pubcodetools.japanpostalcode;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class JapanPostalCodes {
  private static final String version = "2021-03-31";
  private static final String jsonResource = "/japanese-postal-code.json";
  private List<JapanPostalCode> japanPostalCodes;

  /**
   * Constructor of JapanPostalCodes.
   */
  public JapanPostalCodes() {
    try (InputStream is = getClass().getResourceAsStream(jsonResource);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
      ObjectMapper mapper = new ObjectMapper();
      japanPostalCodes = mapper.readValue(br, new TypeReference<List<JapanPostalCode>>() {});
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Get Japan postal code information by Postal Code.
   * @param postalCode String
   * @return JapanPostalCode
   */
  public JapanPostalCode get(String postalCode) {
    for (JapanPostalCode jpc : japanPostalCodes) {
      if (postalCode.equals(jpc.getPostalCode())) {
        return jpc;
      }
    }
    return null;
  }

  /**
   * Get all Japan postal code information.
   * @return List of JapanPostalCode
   */
  public List<JapanPostalCode> getAll() {
    return japanPostalCodes;
  }

  public String getVersion() {
    return version;
  }
}
