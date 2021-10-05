package EDU.E7;

import java.sql.SQLOutput;

class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    int pre_channel;

    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 0;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.pre_channel = this.channel;
        this.channel = channel;


    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //E7_11
    public void gotoPrevChannel(){

        this.setChannel(pre_channel);




    }
}

class E7_10{
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: "+t.getChannel());
        t.setChannel(20);
        System.out.println("CH: "+t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH: "+t.getChannel());

    }
}
