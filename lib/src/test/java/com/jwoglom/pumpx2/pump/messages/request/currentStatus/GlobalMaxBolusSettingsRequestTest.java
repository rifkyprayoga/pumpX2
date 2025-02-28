package com.jwoglom.pumpx2.pump.messages.request.currentStatus;

import static com.jwoglom.pumpx2.pump.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.pump.messages.MessageTester;
import com.jwoglom.pumpx2.pump.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.request.currentStatus.GlobalMaxBolusSettingsRequest;

import org.apache.commons.codec.DecoderException;
import org.junit.Test;

public class GlobalMaxBolusSettingsRequestTest {
    @Test
    public void testGlobalMaxBolusSettingsRequest() throws DecoderException {
        // empty cargo
        GlobalMaxBolusSettingsRequest expected = new GlobalMaxBolusSettingsRequest();

        GlobalMaxBolusSettingsRequest parsedReq = (GlobalMaxBolusSettingsRequest) MessageTester.test(
                "00038c0300f4d7",
                3,
                1,
                CharacteristicUUID.CURRENT_STATUS_CHARACTERISTICS,
                expected
        );

        assertHexEquals(expected.getCargo(), parsedReq.getCargo());
    }
}