package com.example.demo.service.address;

import com.example.demo.data.Address;
import com.example.demo.data.ResponseFormat;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ResponseFormat format;

    @Override
    public List<Address> listAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address addressFromId(String id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public ResponseFormat saveAddress(Address address) {
        addressRepository.save(address);

        format.setStatus(HttpStatus.CREATED.value());
        format.setMessage("Record Created");
        format.setTimeStamp(System.currentTimeMillis());
        return format;
    }

    @Override
    public ResponseFormat updateAddress(Address address, String Id) {
        address.setId(Id);
        addressRepository.save(address);
        format.setStatus(HttpStatus.OK.value());
        format.setMessage("Record Updated");
        format.setTimeStamp(System.currentTimeMillis());

        return format;
    }

    @Override
    public ResponseFormat deleteAddress(String Id) {
        addressRepository.deleteById(Id);
        format.setStatus(HttpStatus.OK.value());
        format.setMessage("Record Deleted");
        format.setTimeStamp(System.currentTimeMillis());

        return format;
    }

    @Override
    public ResponseFormat deleteAllAddress() {
       addressRepository.deleteAll();
       format.setStatus(HttpStatus.OK.value());
       format.setMessage("All records deleted");
       format.setTimeStamp(System.currentTimeMillis());

       return format;
    }


}
