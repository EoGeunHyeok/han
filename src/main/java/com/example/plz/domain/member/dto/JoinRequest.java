package com.example.plz.domain.member.dto;

import com.example.plz.domain.member.entity.MemberRole;
import com.example.plz.domain.member.entity.Member;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class JoinRequest {

    @NotBlank(message = "ID를 입력하세요.")
    private String username;

    @NotBlank(message = "비밀번호를 입력하세요.")
    private String password;
    private String passwordCheck;

    @NotBlank(message = "이름을 입력하세요.")
    private String name;



    public Member toEntity(){
        return Member.builder()
                .username(username)
                .password(password)
                .name(name)
                .build();
    }
}