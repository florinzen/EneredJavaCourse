package module2.reportsgenerator.practice.model;

public class Report {
    private String outputData;

    public Report(String outputData) {
        this.outputData = outputData;
    }

    @Override
    public String toString() {
        return "Report{" +
                "outputData='" + outputData + '\'' +
                '}';
    }
}
