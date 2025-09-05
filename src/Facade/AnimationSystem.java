package Facade;

public class AnimationSystem {
    private String animation;
    
    public AnimationSystem(){

    }

    public void play(String animation){
        System.out.printf("Animation %s is playing...\n", this.animation=animation);
    }

    public String getAnimation() {
        return animation;
    }
}
