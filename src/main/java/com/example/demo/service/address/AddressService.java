package com.example.demo.service.address;

import com.example.demo.data.Address;
import com.example.demo.data.ResponseFormat;

import java.util.List;

public interface AddressService {

    public List<Address> listAllAddresses();
    public Address addressFromId(String id);
    public ResponseFormat saveAddress(Address address);
    public ResponseFormat updateAddress(Address address, String Id);
    public ResponseFormat deleteAddress(String Id);
    public ResponseFormat deleteAllAddress();

}
