package com.jwoglom.pumpx2.pump.messages.response.currentStatus;

import static com.jwoglom.pumpx2.pump.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.pump.messages.MessageTester;
import com.jwoglom.pumpx2.pump.bluetooth.CharacteristicUUID;

import org.apache.commons.codec.DecoderException;
import org.junit.Ignore;
import org.junit.Test;

public class PumpFeaturesV2ResponseTest {
    @Test
    @Ignore("needs to be run on a V2 pump")
    public void testPumpSupportedFeaturesResponse() throws DecoderException {
        PumpFeaturesV2Response expected = new PumpFeaturesV2Response(
            // int status, int supportedFeaturesIndex, long pumpFeaturesBitmask
        );

        PumpFeaturesV2Response parsedRes = (PumpFeaturesV2Response) MessageTester.test(
                "xxxx",
                3,
                1,
                CharacteristicUUID.CURRENT_STATUS_CHARACTERISTICS,
                expected
        );

        assertHexEquals(expected.getCargo(), parsedRes.getCargo());
    }
}