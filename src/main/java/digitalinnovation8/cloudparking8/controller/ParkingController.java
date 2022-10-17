package digitalinnovation8.cloudparking8.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import digitalinnovation8.cloudparking8.controller.dto.ParkingDTO;
import digitalinnovation8.cloudparking8.controller.mapper.ParkingMapper;
import digitalinnovation8.cloudparking8.model.Parking;
import digitalinnovation8.cloudparking8.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {
    // findAll
	// create
	// update
	// findById
	// delete

    private final ParkingService parkingService;  
    private final ParkingMapper parkingMapper;


    public ParkingController(ParkingService parkingService, ParkingMapper parkingMapper) {
        this.parkingService = parkingService;
        this.parkingMapper = parkingMapper;
    } //substituindo o @Autowired, das duas formas é injeção de dependência

    @GetMapping
    public List<ParkingDTO> findAll(){
        List<Parking> parkingList = parkingService.findAll();
        List<ParkingDTO> result = parkingMapper.toParkingDTOList(parkingList);
        return result;
    }
}
