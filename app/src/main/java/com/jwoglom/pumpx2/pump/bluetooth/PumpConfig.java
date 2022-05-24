package com.jwoglom.pumpx2.pump.bluetooth;

public class PumpConfig {

    public static String pumpSerial = "90556643";
    public static String pumpMAC = "F7:9F:58:02:A9:3C";

    public static String bluetoothName() {
        return "tslim X2 ***" + pumpSerial.substring(pumpSerial.length()-3);
    }
}
