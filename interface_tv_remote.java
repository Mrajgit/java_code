interface TvRemote{
    void volume_up();
    void volume_down();
}
interface SmartTvRemote extends TvRemote{
    void change_chn();
    void PlayGame();
}
class Tv implements TvRemote, SmartTvRemote{
    @Override
    public void volume_up() {
        System.out.println("volume up ................");
    }

    @Override
    public void volume_down() {
        System.out.println("volume down ..............");
    }

    @Override
    public void change_chn() {
        System.out.println("change the channel right now");
    }

    @Override
    public void PlayGame() {
        System.out.println("it's time to play game");
    }
}
public class interface_tv_remote {
    public static void main(String[] args) {
        Tv t= new Tv();
        t.volume_up();
        t.volume_down();
        t.change_chn();
        t.PlayGame();
    }
}
