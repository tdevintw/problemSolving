package StreamsJava.domain;

import java.time.LocalDate;

public class Estimate {

    private int id;
    private double costTotal;
    private LocalDate creationDate;
    private LocalDate validatedAt;
    private boolean isAccepted;
    private Project project;

    public Estimate(int id, double costTotal, LocalDate creationDate, LocalDate validatedAt, boolean isAccepted, Project project) {
        this.id = id;
        this.costTotal = costTotal;
        this.creationDate = creationDate;
        this.validatedAt = validatedAt;
        this.isAccepted = isAccepted;
        this.project = project;
    }

    public Estimate(double costTotal, LocalDate creationDate, LocalDate validatedAt, boolean isAccepted, Project project) {
        this.costTotal = costTotal;
        this.creationDate = creationDate;
        this.validatedAt = validatedAt;
        this.isAccepted = isAccepted;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getValidatedAt() {
        return validatedAt;
    }

    public void setValidatedAt(LocalDate validatedAt) {
        this.validatedAt = validatedAt;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
