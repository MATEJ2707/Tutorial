package cz.asseco.tutorial.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Firma {

    @Id
    private String ico; // IČO je 8místný string, takže necháme jako @Id

    private String adresaSidla;
    private String nazevFirmy;

    @OneToMany(mappedBy = "firma", cascade = CascadeType.ALL)
    private List<Pobocka> pobocky;
}

