package net.benyghil.accounts.Dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
//POJO
@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter

/*
* استعمل class:
business logic
entities (JPA)
objects قابلين للتغيير
*  class is Mutable : قابلين للتغيير
*   record is Immutable object
*   DTO (بحال ResponseDto ديالك)
    API responses
    data فقط بلا logic
* */
public class AccountsContactInfoDto {
    private String message;
    private Map<String,String> contactDetails;
    private List<String> onCallSupport;
}
