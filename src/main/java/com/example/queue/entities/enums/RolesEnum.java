package com.example.queue.entities.enums;

import lombok.Getter;

@Getter
public enum RolesEnum {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN"),
    DELETED("ROLE_DELETED");

    private final String role;

    RolesEnum(String role) {
        this.role = role;
    }
}
