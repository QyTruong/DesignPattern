package Proxy;

public class RealVideo implements Video{
    private String filename;
    
    public RealVideo(String filename){
        this.filename = filename;
        System.out.println("Loading video from disk...");
    }

    @Override
    public void Play() {
        System.out.println("Playing video " + this.filename);
    }
    
}
