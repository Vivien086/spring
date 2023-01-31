package com.leven.spring.pojo;

import lombok.*;

/**
 * 用户实体类
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private int id;
    private String username;
    private String password;
}
