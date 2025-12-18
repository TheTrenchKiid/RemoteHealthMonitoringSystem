public class Doctor {
    private String id;
    private String name;

    public Doctor(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void reviewAlert(Alert alert) {
        System.out.println("Doctor reviewing alert: " + alert.getMessage());
    }
}
