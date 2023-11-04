public interface AdvancedMediaPlayerInterface {
    void loadFilename(String filename);
    void listen();
}

class VlcPlayer implements AdvancedMediaPlayerInterface {

    String myFile;

    @Override
    public void loadFilename(String filename) {
        this.myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc File. Name: " + myFile);
    }
}

class Mp4Player implements AdvancedMediaPlayerInterface {
    String myFile;
    @Override
    public void loadFilename(String filename) {
        this.myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing Mp4 File. Name: " + myFile);
    }
}
