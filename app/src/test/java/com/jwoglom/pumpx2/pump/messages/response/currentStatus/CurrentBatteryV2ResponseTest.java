package com.jwoglom.pumpx2.pump.messages.response.currentStatus;

import static com.jwoglom.pumpx2.pump.messages.MessageTester.assertHexEquals;

import com.jwoglom.pumpx2.pump.messages.MessageTester;
import com.jwoglom.pumpx2.pump.bluetooth.CharacteristicUUID;
import com.jwoglom.pumpx2.pump.messages.response.currentStatus.CurrentBatteryV2Response;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;

public class CurrentBatteryV2ResponseTest {
    @Test
    public void testCurrentBatteryV2Response() throws DecoderException {
        throw new NotImplementedException();
//        CurrentBatteryV2Response expected = new CurrentBatteryV2Response(
//            // int currentBatteryAbc, int currentBatteryIbc, int chargingStatus, int unknown1, int unknown2, int unknown3, int unknown4
//        );
//
//        CurrentBatteryV2Response parsedRes = (CurrentBatteryV2Response) MessageTester.test(
//                "xxxx",
//                2,
//                1,
//                CharacteristicUUID.CURRENT_STATUS_CHARACTERISTICS,
//                expected
//        );
//
//        assertHexEquals(expected.getCargo(), parsedRes.getCargo());
    }
}