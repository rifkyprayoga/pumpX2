package com.jwoglom.pumpx2.pump.messages.request.currentStatus;

import com.google.common.base.Preconditions;
import com.jwoglom.pumpx2.pump.messages.Message;
import com.jwoglom.pumpx2.pump.messages.MessageType;
import com.jwoglom.pumpx2.pump.messages.annotations.MessageProps;
import com.jwoglom.pumpx2.pump.messages.response.currentStatus.PumpFeaturesV2Response;

@MessageProps(
    opCode=-96,
    size=0,
    type=MessageType.REQUEST,
    response=PumpFeaturesV2Response.class
)
public class PumpFeaturesV2Request extends Message {
    public PumpFeaturesV2Request() {
        this.cargo = EMPTY;
    }

    public void parse(byte[] raw) {
        Preconditions.checkArgument(raw.length == props().size());
        this.cargo = raw;
        
    }

    
}