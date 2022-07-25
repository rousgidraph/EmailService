package com.gidraph.EmailService.Controller;

import com.gidraph.EmailService.Domain.EmailDetails;
import com.gidraph.EmailService.Services.EmailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final EmailServiceImpl emailService;

    @PostMapping("/sendMail")
    private String sendPlainEmail(@RequestBody EmailDetails emailDetails){
        return emailService.sendSimpleMail(emailDetails);
    }


    @PostMapping("/sendMailWithAttachment")
    private String sendRichEmail(@RequestBody EmailDetails emailDetails){
        return emailService.sendMailWithAttachment(emailDetails);
    }



}
