package Facade;

public class SoundSystem {
    private String audioName;

    public SoundSystem(){

    }

    public void play(String audioName){
        System.out.printf("Sound %s is playing...\n", this.audioName=audioName);
    }

    public String getAudioName() {
        return audioName;
    }
}
