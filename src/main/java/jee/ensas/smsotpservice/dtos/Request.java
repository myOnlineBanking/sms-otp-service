package jee.ensas.smsotpservice.dtos;

import lombok.Data;

@Data
public class Request {
    private String phone;
    private String otp;
}
