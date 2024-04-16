package com.hestia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hestia.dao.GuestRepository;
import com.hestia.model.Guest;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public Optional<Guest> findById(Long id) {
        return guestRepository.findById(id);
    }
}
