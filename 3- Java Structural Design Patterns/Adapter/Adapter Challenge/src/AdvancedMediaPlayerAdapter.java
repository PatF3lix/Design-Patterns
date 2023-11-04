public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {

    AdvancedMediaPlayerInterface advancedMediaPlayerInterface;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface advancedMediaPlayerInterface) {
        this.advancedMediaPlayerInterface = advancedMediaPlayerInterface;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayerInterface.loadFilename(fileName);
        advancedMediaPlayerInterface.listen();
    }
}
