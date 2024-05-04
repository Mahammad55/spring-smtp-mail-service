package com.gmail.mailsender.service;

public interface MailSenderService {
    String sendMail(String toEmail, String subject, String body);
}
