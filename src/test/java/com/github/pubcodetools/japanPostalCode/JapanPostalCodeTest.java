package com.github.pubcodetools.japanPostalCode;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JapanPostalCodeTest {
    private static JapanPostalCode jpc;
    private static final String testJson = "{\"postalCode\":\"郵便番号\",\"prefecture\":\"都道府県\",\"city\":\"市区町村\",\"street\":\"通り\"}";

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