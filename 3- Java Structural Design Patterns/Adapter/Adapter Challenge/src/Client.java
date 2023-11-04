public class Client {
    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "like a toy soldier.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "stan.mp4");


        AdvancedMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "Beautiful.vlc");

        audioPlayer.play("vlc", "Beautiful.vlc");

    }
}