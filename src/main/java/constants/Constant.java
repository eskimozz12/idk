package constants;

import java.time.Duration;

public class Constant {
    public static class TimeoutVariable {
        public static final Duration IMPLICIT_WAIT = Duration.ofSeconds(5);
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
    }

    public static class Urls {
        public static final String REALT_HOME_PAGE = "https://realt.by/";
    }
}
