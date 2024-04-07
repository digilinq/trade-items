package com.eightbits.commerce.trade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class Gs1SpecificationsTest {
    @InjectMocks
    Gs1Specifications gs1Version;

    @Test
    void getVersion() {
        assertEquals("3.1.27", gs1Version.getVersion());
    }
}
