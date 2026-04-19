package net.benyghil.accounts.mappers;

import net.benyghil.accounts.Dto.CustomerDto;
import net.benyghil.accounts.entity.Customer;

public final class CustomerMapper {

    public static Customer mapperToCustomer(CustomerDto customerDto, Customer CustomerEntity) {
        CustomerEntity.setName(customerDto.getName());
        CustomerEntity.setEmail(customerDto.getEmail());
        CustomerEntity.setMobileNumber(customerDto.getMobileNumber());
        return CustomerEntity;
    }
    public static CustomerDto mapperToACustomerDto(Customer customerEntity, CustomerDto customerDto) {
        customerDto.setEmail(customerEntity.getEmail());
        customerDto.setMobileNumber(customerEntity.getMobileNumber());
        customerDto.setName(customerEntity.getName());
        return customerDto;
    }

}
