public class Patient {
    private String id;
    private String name;
    private WearableDevice device;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void assignDevice(WearableDevice device) {
        this.device = device;
    }

    public WearableDevice getDevice() {
        return device;
    }
}
