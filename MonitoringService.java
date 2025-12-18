public class MonitoringService {

    public Alert analyze(VitalSign vital) {
        if (vital.getType().equals("HeartRate") && vital.getValue() > 100) {
            return new Alert("Abnormal heart rate detected");
        }
        return null;
    }
}
