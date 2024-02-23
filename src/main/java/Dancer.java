public class Dancer {
    private String name;

    public Dancer(String name) {
        this.name = name;
    }

    public String performDance(DanceStyle danceStyle) {
        String performance = name + " is performing " + danceStyle.getName() + " dance";
        return performance + "\n" + danceStyle.perform();
    }
}