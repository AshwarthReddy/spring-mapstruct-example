package com.anr.mapstruct.mapper;

import com.anr.mapstruct.Car;
import com.anr.mapstruct.dto.CarDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);


	CarDTO carToCarDto(Car car);

	@InheritInverseConfiguration
	Car carDTOCar(CarDTO carDTO);

}
