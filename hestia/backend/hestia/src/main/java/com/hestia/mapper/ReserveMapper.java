package com.hestia.mapper;

import java.time.format.DateTimeFormatter;
import java.util.List;

import com.hestia.dto.ReserveDTO;
import com.hestia.model.Accommodation;
import com.hestia.model.Fare;
import com.hestia.model.Guest;
import com.hestia.model.Reserve;

public class ReserveMapper {
    
    public static ReserveDTO mapToReserveDTO (Reserve reserve, 
                                              Guest responsible, 
                                              List<Accommodation> accommodations, 
                                              Fare fare) {
        
        return new ReserveDTO(
        
            reserve.getId(),
            reserve.getCheckIn().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            reserve.getCheckOut().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            reserve.getOrigin().ordinal(),
            reserve.getAdults(),
            reserve.getChildren(),
            GuestMapper.mapToGuestDTO(responsible),
            AccommodationMapper.mapToAccommodationDTOList(accommodations),                    
        );
    }
}
