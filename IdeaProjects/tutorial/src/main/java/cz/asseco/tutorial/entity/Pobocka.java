package cz.asseco.tutorial.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Pobocka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adresa;
    private int pocetTerminalu;

    @ManyToOne
    @JoinColumn(name = "firma_ico")
    private Firma firma;

    @OneToMany(mappedBy = "pobocka", cascade = CascadeType.ALL)
    private List<Terminal> terminaly;
}

