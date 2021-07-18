package lesson8;

public class JoggingTrack extends Obstacles{

    int length;

    public JoggingTrack(String name, String type, int length) {
        super(name, type);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
