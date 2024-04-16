package com.hestia.mapper;

import java.time.format.DateTimeFormatter;

import com.hestia.dto.GuestDTO;
import com.hestia.model.Guest;

public class GuestMapper {
    
    public static GuestDTO mapToGuestDTO (Guest guest) {
        return new GuestDTO(
            guest.getId(),
            guest.getFullName(),
            guest.getDocumentNumber(),
            guest.getDocumentType().ordinal(),
            guest.getSex().ordinal(),
            guest.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            guest.getTelephone(),
            guest.getZipCode(),
            guest.getAddress(),
            guest.getCity()
        );
    }
}
