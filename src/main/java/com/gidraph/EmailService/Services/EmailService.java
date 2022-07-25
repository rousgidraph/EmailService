package com.gidraph.EmailService.Services;

import com.gidraph.EmailService.Domain.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
