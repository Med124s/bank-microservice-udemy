package net.benyghil.accounts.service;

import net.benyghil.accounts.Dto.CustomerDto;
import net.benyghil.accounts.entity.Customer;

public interface IAccountService {
    /**
     *
     * @param customerDto - object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Account details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - Input customerDto
     */
    boolean updateAccount(CustomerDto customerDto);
    /**
     *
     * @param mobileNumber - Input  mobileNumber
     */
    boolean deleteAccount(String mobileNumber);
}
