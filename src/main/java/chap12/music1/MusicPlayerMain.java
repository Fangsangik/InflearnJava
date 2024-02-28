package chap12.music1;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeUp();
        player.volumeDown();
        player.setVolumeStatus();
        player.off();
    }
}
