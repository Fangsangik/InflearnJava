package chap12.music;

public class MusicPlaterMain {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
       on(data);
       increaseVolume(data);
       decreaseVolume(data);
       showStatus(data);
       off(data);
    }

    public static void increaseVolume(MusicPlayerData data){
        data.volume++;
        System.out.println("음량 증가");
    }

    static void decreaseVolume(MusicPlayerData data){
        data.volume--;
        System.out.println("음량 감소");
    }

    public static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("ON");
    }

    static void showStatus(MusicPlayerData data){
        if (data.isOn){
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("OFF");
    }
}
