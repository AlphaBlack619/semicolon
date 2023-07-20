package tdd;
public class Television {
    private boolean isOn;
    private int chanel;
    private int volume = 0;
    public boolean getIsOn() {return isOn;}
    public int getChanel() {return chanel;}
    public int getVolume() {return volume;}
    public void setOn() {
        isOn = !isOn;
    }
    public void  setChanel(int chanel) {this.chanel = chanel;}
    public void nextChanel() {if (chanel > 0 || chanel == 0) {chanel++;}}
    public void previousChanel() {if (chanel > 0) chanel--;}
    public void setVolume(int volume) {if (volume > 0 && volume < 30)this.volume = volume;}
    public void muteVolume() {if (volume > 0) this.volume = 0;}
    public void increaseVolume() {if (volume == 0 || volume > 0 && volume < 30) volume++;}
    public void decreaseVolume() {if (volume > 0 && volume < 30) volume--;}
    public void scanChannels() {chanel = (int) ((Math.random() * 100) + 1);}
}