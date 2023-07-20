package tdd;

public class Mp3 {
   private boolean isOn;
   private boolean play;
   private boolean mode;
   private int volume;
   private int song;
   private  double frequency;

    public void chooseSong(int song){if (song > 0)this.song = song;}
   public boolean getIsOn(){return isOn;}
    public void setOn() { isOn = !isOn;}
    public void setVolume(int volume) {if (volume > 0 && volume < 30 || volume == 0) this.volume = volume;}
    public int getVolume() {return volume;}
    public void increaseVolume() {if (volume > 0 && volume < 30 || volume == 0) volume++;}
    public void decreaseVolume() {if (volume > 0 && volume < 30 || volume == 30) volume--;}
    public void muteVolume() {if (volume > 0 && volume < 30 || volume == 30) volume = 0;}
    public int checkSong() { return song;}
    public void nextSong(){song++;}
    public void backSong() {if (song > 0) song--;}
    public double radioMode() {return frequency;}
    public void setFrequency(double frequency) {if (frequency > 0.00) this.frequency = frequency;}
    public void scanRadio() { this.frequency = Math.random();}
    public void nextRadioStation() { frequency++;}
    public void previousStation() {if (frequency > 0) frequency--;}
    public boolean getRadioMode() {if (!mode) mode = true; return true;}
    public boolean SDCardMode() {mode = true; return true;}
    public boolean checkPlay(){return play;}
    public void play() {play = !play;}
}