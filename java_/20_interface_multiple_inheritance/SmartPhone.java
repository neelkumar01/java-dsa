
public class SmartPhone implements Camera, MusicPlayer, Phone {

    @Override
    public void takePhoto() {
        System.out.println("photo taken");
    }

    @Override
    public void playMusic() {
        System.out.println("music is playing");
    }

    @Override
    public void makeCall() {
        System.out.println("dialing...");
    }


}
