package rs.raf.restDemoMS.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent", nullable = false)
    private Long idstudent;

    private String first_name;

    private String last_name;

    @ManyToOne
    @JoinColumn(name = "id_smer")
    private Smer smer;

    @ManyToMany(mappedBy = "studenti")
    private List<Predmet> predmeti;

    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public Long getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(Long idstudent) {
        this.idstudent = idstudent;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
