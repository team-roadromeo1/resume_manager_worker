package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.data.Address;
import com.example.demo.data.ResponseFormat;
import com.example.demo.mapping.UrlMapper;
import com.example.demo.service.address.AddressService;
import com.example.demo.util.TestData;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AddressTest {

    @MockBean
    AddressService manager;

    @InjectMocks
    Address address;

    @Autowired
    MockMvc mvc;
    
    @Autowired
    TestData test;

    @Autowired
    ResponseFormat response;

    String uri = UrlMapper.globalUrl + UrlMapper.dataUrl;

    // @Test
    // void testGetAllAddress() throws Exception {
    //     Address address = test.getAddressData(Long.valueOf(1));
    //     List<Address> addresses = Arrays.asList(address);

    //     Mockito.when(manager.listAllAddresses()).thenReturn(addresses);

    //     mvc.perform(get(uri+"/findAllAddress/"))
    //     .andExpect(status().isOk())
    //     .andExpect(jsonPath("$", Matchers.hasSize(1)))
    //     .andExpect(jsonPath("$[0].address_details", Matchers.is("test street")));
    // }

    @Test
    void testGetAddressFromId() {
        
    }

    @Test
    void testSaveAddress() {

    }

    @Test
    void testUpdateAddress() {

    }
    @Test
    void testDeleteAddress() {
        
    }

    @Test
    void testDeleteAllAddress() {

    }
}
