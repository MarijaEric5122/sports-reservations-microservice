package rs.raf.restDemoMS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Predmet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_predmet", nullable = false)
    private Long id_predmet;

    private String naziv;

    @ManyToOne
    @JoinColumn(name = "id_smer")
    private Smer smer;

    @ManyToMany
    @JoinTable(name="predmet_student",
            joinColumns=@JoinColumn(name="predmet_id"),
            inverseJoinColumns=@JoinColumn(name="student_id")
    )
    @JsonIgnore
    private List<Student> studenti = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Predmet(){
        super();
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public Smer getSmer() {
        return smer;
    }

    public void setSmer(Smer smer) {
        this.smer = smer;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setId_predmet(Long id_predmet) {
        this.id_predmet = id_predmet;
    }

    public Long getId_predmet() {
        return id_predmet;
    }
}
