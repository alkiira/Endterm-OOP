import java.util.List;

public class DanceGroup {
    private String name;
    private List<Dancer> dancers;

    public DanceGroup(String name, List<Dancer> dancers) {
        this.name = name;
        this.dancers = dancers;
    }

    public String performGroupDance(DanceStyle danceStyle) {
        StringBuilder result = new StringBuilder();
        for (Dancer dancer : dancers) {
            result.append(dancer.performDance(danceStyle)).append("\n");
        }
        return result.toString();
    }
}