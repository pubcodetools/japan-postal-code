package io.github.pubcodetools.japanpostalcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JapanPostalCodesTest {

  private static JapanPostalCodes jpcs;

  @BeforeAll
  static void beforeAll() {
    jpcs = new JapanPostalCodes();
  }

  @Test
  void get() {
    JapanPostalCode jpc = jpcs.get("0600000");
    assertEquals("0600000", jpc.getPostalCode());
    assertEquals("北海道", jpc.getPrefecture());
    assertEquals("札幌市 中央区", jpc.getCity());
    assertEquals("", jpc.getStreet());
  }

  @Test
  void getNoHit() {
    JapanPostalCode jpc = jpcs.get("DUMMY");
    assertNull(jpc);
  }

  @Test
  void getAll() {
    List<JapanPostalCode> jpcList = jpcs.getAll();
    assertTrue(jpcList.size() > 0);
  }

  @Test
  void getVersion() {
    String version = jpcs.getVersion();
    assertEquals("2021-03-31", version);
  }
}
