package chap27.zoneId;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId.getRules() = " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId zoneId2 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId2 = " + zoneId2);
    }
}
