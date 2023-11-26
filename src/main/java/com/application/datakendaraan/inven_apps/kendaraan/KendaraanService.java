package com.application.datakendaraan.inven_apps.kendaraan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KendaraanService {

    private final KendaraanRepository kendaraanRepository;

    @Autowired
    public KendaraanService(KendaraanRepository kendaraanRepository) {
        this.kendaraanRepository = kendaraanRepository;
    }

    public List<Kendaraan> getAllKendaraan() {
        return kendaraanRepository.findAll();
    }

    public Kendaraan saveKendaraan(Kendaraan kendaraan) {
        return kendaraanRepository.save(kendaraan);
    }
}