package com.earuile.bubble.rest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "server.registration")
public record MessengerServerRegistrationProperty(String uri) {}
