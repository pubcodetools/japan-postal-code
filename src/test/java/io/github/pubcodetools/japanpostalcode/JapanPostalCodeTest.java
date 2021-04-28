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

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JapanPostalCodeTest {
  private static JapanPostalCode jpc;
  private static final String testJson =
      "{\"postalCode\":\"郵便番号\",\"prefecture\":\"都道府県\",\"city\":\"市区町村\",\"street\":\"通り\"}";

  @BeforeAll
  static void beforeAll() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    jpc = mapper.readValue(testJson, JapanPostalCode.class);
  }

  @Test
  void getPostalCode() {
    assertEquals("郵便番号", jpc.getPostalCode());
  }

  @Test
  void getPrefecture() {
    assertEquals("都道府県", jpc.getPrefecture());
  }

  @Test
  void getCity() {
    assertEquals("市区町村", jpc.getCity());
  }

  @Test
  void getStreet() {
    assertEquals("通り", jpc.getStreet());
  }
}
