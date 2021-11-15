package org.kodigo.examplemvc.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Tecnicos")

@Getter @Setter
public class Tecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tec_id;
    private String tec_nombres;
    private String tec_apellidos;
    private Date tec_fec_nac;
    private String tec_dui;

    public Tecnico(long tec_id, String tec_nombres, String tec_apellidos, Date tec_fec_nac, String tec_dui) {
        this.tec_id = tec_id;
        this.tec_nombres = tec_nombres;
        this.tec_apellidos = tec_apellidos;
        this.tec_fec_nac = tec_fec_nac;
        this.tec_dui = tec_dui;
    }
}
