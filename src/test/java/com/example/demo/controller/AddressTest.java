package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.service.address.AddressServiceImpl;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AddressTest {

    @MockBean
    AddressServiceImpl service;

    @InjectMocks
    Address address;

    @Autowired
    MockMvc mvc;
    

    @Test
    void testDeleteAddress() {

    }

    @Test
    void testDeleteAllAddress() {

    }

    @Test
    void testGetAddressFromId() {

    }

    @Test
    void testGetAllAddress() {

    }

    @Test
    void testSaveAddress() {

    }

    @Test
    void testUpdateAddress() {

    }
}
