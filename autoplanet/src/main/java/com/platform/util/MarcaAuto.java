package com.platform.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class MarcaAuto {
	
	private List<String> marcaautos;

	public MarcaAuto() {
		String[] arrMarcaAutos = { "Abarth", "Alfa Romeo", "Aston Martin", "Audi", "Bentley",
				"BMW", "Cadillac", "Caterham", "Chevrolet", "Citroen", "Dacia", "Ferrari", "Fiat",
				"Ford", "Honda", "Infiniti", "Isuzu", "Iveco", "Jaguar", "Jeep", "Kia",
				"KTM", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Lotus",
				"Maserati", "Mazda", "Mercedes-Benz", "Mini", "Mitsubishi", "Morgan", "Nissan",
				"Opel", "Peugeot", "Piaggio", "Porsche", "Renault", "Rolls-Royce", "Seat",
				"Skoda", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo" };

		this.marcaautos = new ArrayList<>(Arrays.asList(arrMarcaAutos));
	}
	
	public List<String> getMarcaAutos() {
		return marcaautos;
	}

}
