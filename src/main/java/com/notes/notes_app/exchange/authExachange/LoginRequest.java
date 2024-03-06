package com.notes.notes_app.exchange.authExachange;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
  @NotBlank
  private String username;
  @NotBlank
  private String password;
}
