package com.project.durian.services;

public interface EmailService {
    void sendEmail(String email, String subject, String body);
}