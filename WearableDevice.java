import java.util.Random;

public class WearableDevice {
    private String deviceId;
    private Random random;

    // Simulates a wearable device that records patient vital signs
    public WearableDevice(String deviceId) {
        this.deviceId = deviceId;
        this.random = new Random();
    }

    // Generates a random heart rate value to simulate real sensor data
    public VitalSign readHeartRate() {
        double heartRate = 60 + random.nextInt(80); // Range: 60–139 bpm
        return new VitalSign("HeartRate", heartRate);
    }
}
