package system.security.data.dto;

import lombok.Data;

@Data
public class SigninRequest {
    private String username;
    private String password;
}