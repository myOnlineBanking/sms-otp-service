package jee.ensas.smsotpservice.controllers;

import jee.ensas.smsotpservice.dtos.Request;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Sms")
public class SmsController {

    private final static String ACCOUNT_SID = "<YOUR_ACCOUNT_ID>";
    private final static String AUTH_ID = "<YOUR_AUTH_ID>";

    @CrossOrigin(origins = "*")
    @PostMapping("/send")
    public String sendSms(@RequestBody Request request , final HttpServletRequest servletRequest){
        Twilio.init(ACCOUNT_SID, AUTH_ID);
        Message.creator(new PhoneNumber(request.getPhone()), new PhoneNumber("<YOUR_PROVIDED_PHONE_NUMBER>"),
                "Your OTP is : "+ request.getOtp()).create();
        return "Message Sent";
    }

}
