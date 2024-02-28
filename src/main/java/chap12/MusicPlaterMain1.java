package chap12;

public class MusicPlaterMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        System.out.println("음악 플레이어 켜짐");
        volume++;
        System.out.println("음악 플레이어 볼륨" + volume);
        volume++;
        System.out.println("음악 플레이어 볼륨" + volume);
        volume--;
        System.out.println("음악 플레이어 볼륨" + volume);

        if (isOn) {
            System.out.println("음악 플에이어 On, 볼륨" + volume);
        }

        isOn = false;
        System.out.println("음악플레이어 off");
    }
}
