package com.earuile.bubble.ui.controllers;

import com.earuile.bubble.public_interface.MessageModelDto;

import java.util.List;

public interface PullMessagesCallback {
    void addMessages(List<MessageModelDto> newMessages);
}
