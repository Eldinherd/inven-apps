package com.application.datakendaraan.inven_apps.kendaraan;

import jakarta.persistence.*;

@Entity
public class Kendaraan {

    @Id
    @Column(name = "NomorRegistrasiKendaraan", nullable = false, unique = true)
    private String nomorRegistrasiKendaraan;

    @Column(name = "NamaPemilik", nullable = false)
    private String namaPemilik;

    @Column(name = "Alamat", length = 1000)
    private String alamat;

    @Column(name = "MerkKendaraan")
    private String merkKendaraan;

    @Column(name = "TahunPembuatan", length = 4)
    private Integer tahunPembuatan;

    @Column(name = "KapasitasSilinder")
    private Integer kapasitasSilinder;

    @Column(name = "WarnaKendaraan")
    private String warnaKendaraan;

    @Column(name = "BahanBakar")
    @Enumerated(EnumType.STRING)
    private BahanBakarEnum bahanBakar;

}