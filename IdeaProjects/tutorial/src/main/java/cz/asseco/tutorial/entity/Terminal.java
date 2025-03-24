package cz.asseco.tutorial.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Terminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kod;

    @Enumerated(EnumType.STRING)
    private ModelE model;

    private String poznamka;

    @Enumerated(EnumType.STRING)
    private StavT stav;

    @ManyToOne
    @JoinColumn(name = "pobocka_id")
    private Pobocka pobocka;
}
