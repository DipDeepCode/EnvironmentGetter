import java.util.Map;

public class EnvironmentGetter {
    private static final Map<String, String> getenv = System.getenv();

    public static void main(String[] args) {
        getenv.forEach((s, s2) -> System.out.println(s + " - " + s2));
        System.out.println();
        System.out.println(getenv.get("GIT_HOME"));
    }
}
