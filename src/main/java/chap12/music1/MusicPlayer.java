package chap12.music1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp(){
        volume++;
        System.out.println("volume = " + volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("volume = " + volume);
    }

    void setVolumeStatus(){
        if (isOn){
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
    }
}
