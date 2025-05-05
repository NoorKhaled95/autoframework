package configs.testdata;


public class TestDataFactory {
    public static PlanningDataTemplate getTestData(String environment, String language) {
        if (environment.equalsIgnoreCase("staging") && language.equalsIgnoreCase("english")) {
            return new EnglishStagingTestData();
        } else if (environment.equalsIgnoreCase("production") && language.equalsIgnoreCase("english")) {
            return new EnglishProductionTestData();
        }
        // Add other combinations as needed
        throw new IllegalArgumentException("Invalid environment or language”");
    }

    public static CrewDataTemplate getCrewTestData(String environment, String language) {
        if (environment.equalsIgnoreCase("staging") && language.equalsIgnoreCase("english")) {
            return new CrewStagingTestData();
        } else if (environment.equalsIgnoreCase("production") && language.equalsIgnoreCase("english")) {
            return new CrewProductionTestData();
        }
        // Add other combinations as needed
        throw new IllegalArgumentException("Invalid environment or language”");
    }

}
