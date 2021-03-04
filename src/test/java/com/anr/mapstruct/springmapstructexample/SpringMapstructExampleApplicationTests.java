package com.anr.mapstruct.springmapstructexample;

import com.anr.mapstruct.Car;
import com.anr.mapstruct.dto.CarDTO;
import com.anr.mapstruct.mapper.CarMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringMapstructExampleApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	@DisplayName("Mapping car to CarDTO by MapStruct")
	public void shouldMapCarToDto() {
		//given
		Car car = new Car("Morris", 5);

		//when
		CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car);

		//then
		assertThat(carDto).isNotNull();
		assertThat(carDto.getMake()).isEqualTo("Morris");
		assertThat(carDto.getNumberOfSeats()).isEqualTo(5);
	}


	@Test
	@DisplayName("Mapping CarDTO to Car by MapStruct")
	public void shouldMapCarDTOtoCar() {
		//given
		CarDTO carDTO = new CarDTO("Morris", 5);

		//when
		Car car = CarMapper.INSTANCE.carDTOCar(carDTO);

		//then
		assertThat(car).isNotNull();
		assertThat(car.getMake()).isEqualTo("Morris");
		assertThat(car.getNumberOfSeats()).isEqualTo(5);
	}

}
