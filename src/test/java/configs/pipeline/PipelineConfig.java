package configs.pipeline;

public class PipelineConfig {
    public static boolean testRailReport = false;
    //    public static boolean isBrowserHeadless = true;
    public static boolean isBrowserHeadless = System.getenv("CI") != null;
    public static int hours = 0;

}
