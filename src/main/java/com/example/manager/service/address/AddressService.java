package com.example.manager.service.address;

import com.example.manager.data.Address;
import com.example.manager.data.ResponseFormat;
import java.util.List;

public interface AddressService {

  public List<Address> listAllAddresses();

  public Address addressFromId(Long id);

  public ResponseFormat saveAddress(Address address);

  public ResponseFormat updateAddress(Address address, Long Id);

  public ResponseFormat deleteAddress(Long Id);

  public ResponseFormat deleteAllAddress();
}
