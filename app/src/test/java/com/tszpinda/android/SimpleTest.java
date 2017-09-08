package com.tszpinda.android;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class SimpleTest {

    @Test
    public void addTwo() {
        assertThat(1 + 2).as("can add stuff").isEqualTo(3);
    }

}
