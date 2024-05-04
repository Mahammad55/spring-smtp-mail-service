package com.gmail.mailsender.controller;

import com.gmail.mailsender.service.MailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/mails")
@RequiredArgsConstructor
public class MailSenderController {
    private final MailSenderService mailSenderService;

    @PostMapping
    public String sendMail(
            @RequestHeader String toEmail,
            @RequestHeader String subject,
            @RequestHeader String body) {
        return mailSenderService.sendMail(toEmail, subject, body);
    }
}
