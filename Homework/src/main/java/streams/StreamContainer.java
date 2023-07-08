package streams;
/*
Task 2
*/
public class StreamContainer {
    private String name;
    private long count;

    StreamContainer(String name, long count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, count: %d", this.name, this.count);
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }
}
