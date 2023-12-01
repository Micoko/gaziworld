package com.example.gaziworld.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
  //Enum:사용자권한
  
  GUEST("ROLE_GUEST","손님"),
  USER("ROLE_USER","일반사용자");

  private final String key;
  private final String title;
}
