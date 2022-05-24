package com.jwoglom.pumpx2.messages.response;

import static com.jwoglom.pumpx2.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.messages.MessageTester;
import com.jwoglom.pumpx2.pump.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.request.AlarmStatusRequest;
import com.jwoglom.pumpx2.pump.messages.request.ApiVersionRequest;
import com.jwoglom.pumpx2.pump.messages.response.AlarmStatusResponse;

import org.apache.commons.codec.DecoderException;
import org.junit.Test;

import java.math.BigInteger;

public class AlarmStatusResponseTest {
    @Test
    public void testAlarmStatusEmptyResponse() throws DecoderException {
        // empty cargo
        AlarmStatusResponse expected = new AlarmStatusResponse(BigInteger.ZERO);

        AlarmStatusResponse parsedReq = (AlarmStatusResponse) MessageTester.test(
                "000347030800000000000000005721",
                3,
                1,
                CharacteristicUUID.CURRENT_STATUS_CHARACTERISTICS,
                expected
        );

        assertHexEquals(expected.getCargo(), parsedReq.getCargo());
    }
}
