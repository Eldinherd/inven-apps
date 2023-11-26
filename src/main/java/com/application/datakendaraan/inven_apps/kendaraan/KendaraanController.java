package com.application.datakendaraan.inven_apps.kendaraan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/kendaraan")
    public class KendaraanController {

        private final KendaraanService kendaraanService;

        @Autowired
        public KendaraanController(KendaraanService kendaraanService) {
            this.kendaraanService = kendaraanService;
        }

        @GetMapping
        public List<Kendaraan> getAllKendaraan() {
            return kendaraanService.getAllKendaraan();
        }

        @PostMapping
        public Kendaraan saveKendaraan(@RequestBody Kendaraan kendaraan) {
            return kendaraanService.saveKendaraan(kendaraan);
        }
    }
