package com.application.datakendaraan.inven_apps.kendaraan;


import org.springframework.data.jpa.repository.JpaRepository;

public interface KendaraanRepository extends JpaRepository<Kendaraan, String> {
    // You can add custom queries here if needed
}
