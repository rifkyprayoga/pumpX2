package com.jwoglom.pumpx2.messages.request;

import static com.jwoglom.pumpx2.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.messages.MessageTester;
import com.jwoglom.pumpx2.pump.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.request.ApiVersionRequest;
import com.jwoglom.pumpx2.pump.messages.request.CGMHardwareInfoRequest;

import org.apache.commons.codec.DecoderException;
import org.junit.Test;

public class CGMHardwareInfoRequestTest {
    @Test
    public void testCGMHardwareInfoRequest() throws DecoderException {
        // empty cargo
        CGMHardwareInfoRequest expected = new CGMHardwareInfoRequest();

        CGMHardwareInfoRequest parsedReq = (CGMHardwareInfoRequest) MessageTester.test(
                "0004600400339b",
                4,
                1,
                CharacteristicUUID.CURRENT_STATUS_CHARACTERISTICS,
                expected
        );

        assertHexEquals(expected.getCargo(), parsedReq.getCargo());
    }
}