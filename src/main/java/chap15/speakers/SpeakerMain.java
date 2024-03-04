package chap15.speakers;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolumeInfo();

        speaker.volumeUp();
        speaker.showVolumeInfo();

        speaker.volumeDown();
        speaker.showVolumeInfo();

    }
}
