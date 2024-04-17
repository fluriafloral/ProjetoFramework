package com.hestia.mapper;

import java.util.ArrayList;
import java.util.List;

import com.hestia.dto.AccommodationDTO;
import com.hestia.model.AccCategory;
import com.hestia.model.Accommodation;

public class AccommodationMapper {
    
    public static AccommodationDTO mapToAccommodationDTO (Accommodation accommodation,
                                                          AccCategory accCategory) {
        
        return new AccommodationDTO(
            
            accommodation.getId(),
            accommodation.getName(),
            AccCategoryMapper.mapToAccCategoryDTO(accCategory),
            accommodation.getStatus().ordinal(),
            accommodation.getOccupation(),
            accommodation.getMaxOccupation()

        );
    }

    public static List<AccommodationDTO> mapToAccommodationDTOList (List<Accommodation> accommodations) {

        List<AccommodationDTO> accommodationDTOs = new ArrayList<AccommodationDTO>();
        
        for (Accommodation a: accommodations) {
            accommodationDTOs.add(mapToAccommodationDTO(a, a.getCategory()));
        }

        return accommodationDTOs;
    }
}
