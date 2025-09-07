package Proxy;

public class ProxyVideo implements Video{
    private RealVideo real;
    private String filename;

    public ProxyVideo(String filename){
        this.filename = filename;
    }

    @Override
    public void Play() {
        if (real == null){
            this.real = new RealVideo(filename);
        }
        this.real.Play();
    }
}
