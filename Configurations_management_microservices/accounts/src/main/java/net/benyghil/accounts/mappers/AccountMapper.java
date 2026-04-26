package net.benyghil.accounts.mappers;

import net.benyghil.accounts.Dto.AccountsDto;
import net.benyghil.accounts.entity.Accounts;

public final class AccountMapper {

    public static Accounts mapperToAccounts(AccountsDto accountsDto, Accounts accountsEntity) {
        accountsEntity.setAccountNumber(accountsDto.getAccountNumber());
        accountsEntity.setAccountType(accountsDto.getAccountType());
        accountsEntity.setBranchAddress(accountsDto.getBranchAddress());
        return accountsEntity;
    }
    public static AccountsDto mapperToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

}
