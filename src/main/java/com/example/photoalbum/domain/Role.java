package com.example.photoalbum.domain;

import javax.persistence.Table;

@Table(name = "role")
public enum Role {
    ADMIN,MODERATOR,USER;
}
