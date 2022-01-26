package com.nappy.project.dto.user;

import com.nappy.project.domain.user.Role;
import com.nappy.project.domain.user.User;
import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String username;
    private String password;
    private String email;
    private String nickname;
    private Role role;

    public User toEntity() {
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .nickname(nickname)
                .role(Role.USER)
                .build();
    }

}
