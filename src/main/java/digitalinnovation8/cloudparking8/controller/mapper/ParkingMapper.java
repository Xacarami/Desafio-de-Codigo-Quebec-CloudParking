package digitalinnovation8.cloudparking8.controller.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import digitalinnovation8.cloudparking8.controller.dto.ParkingCreateDTO;
import digitalinnovation8.cloudparking8.controller.dto.ParkingDTO;
import digitalinnovation8.cloudparking8.model.Parking;

@Component
public class ParkingMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ParkingDTO toParkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
        //inicializar objeto, e passar todos os atributos pro outro objeto
    }

    public List<ParkingDTO> toParkingDTOList(List<Parking> parkingList) {
        return parkingList.stream().map(this::toParkingDTO).collect(Collectors.toList());
    }

    public Parking toParking(ParkingCreateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }

    public Parking toParkingCreate(ParkingCreateDTO dto) {
        return MODEL_MAPPER.map(dto, Parking.class);
    }
    
}
