package team.shoppingmall.domain.member.dto.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginServiceDTO {

    private String id;
    private String password;
}