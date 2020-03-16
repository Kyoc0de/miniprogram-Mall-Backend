package com.kyo.mall.dto;

import com.kyo.mall.validators.PasswordEqual;
import lombok.*;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@PasswordEqual()
public class PersonDTO {
    @NonNull
    private String name;

    private Integer age;

    private String password1;

    private String password2;
}
