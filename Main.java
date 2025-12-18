public class Main {

    public static void main(String[] args) {

        // Create system actors
        Patient patient = new Patient("P1", "John Doe");
        Doctor doctor = new Doctor("D1", "Dr. Smith");

        // Create system components
        WearableDevice device = new WearableDevice("W1");
        MonitoringService monitoringService = new MonitoringService();

        // Assign wearable device to patient
        patient.assignDevice(device);

        // Wearable device records heart rate
        VitalSign heartRate = device.readHeartRate();

        // System analyzes the vital sign
        Alert alert = monitoringService.analyze(heartRate);

        // Doctor is notified if abnormal values are detected
        if (alert != null) {
            doctor.reviewAlert(alert);
        }
    }
}
