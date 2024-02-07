package vijay.projects.betavarient.HealthCheck;

public class HealthCheckResponse {
    private String status;
    private String[] activeProfile;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getActiveProfile() {
        return activeProfile;
    }

    public void setActiveProfile(String[] activeProfile) {
        this.activeProfile = activeProfile;
    }
}
