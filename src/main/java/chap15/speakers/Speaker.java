package chap15.speakers;

public class Speaker {
   private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가 할 수 X");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가 합니다");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 줄입니다");
    }

    void showVolumeInfo(){
        System.out.println("현재 음량 " + volume);
    }
}
