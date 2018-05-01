public class Waterbottle {
    private int volume;

    public Waterbottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return this.volume -= 10;
    }

    public int empty() {
        return this.volume = 0;
    }

    public int fill() {
        return this.volume = 100;
    }
}
