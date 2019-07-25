package design_pattern.creational_patters.adapter_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file.name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么都不做
    }
}
