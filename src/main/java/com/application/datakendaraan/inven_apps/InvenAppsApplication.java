package com.application.datakendaraan.inven_apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class InvenAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvenAppsApplication.class, args);
	}
}

@RestController
@RequestMapping("/api")
class MyController {

	@GetMapping("/vehicle-info")
	public String getVehicleInfo() {
		String vehicleInfo = "Nomor Registrasi Kendaraan: ABC123, Nama Pemilik: John Doe, Alamat: Some Address";
		System.out.println(vehicleInfo); // Print to console
		return vehicleInfo;
	}
}