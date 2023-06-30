package com.example.demo.domain2;

import com.example.demo.domain.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author galang
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User2 extends BaseModel {

    @NotEmpty(message = "Username tidak boleh dikosongkan")
    @Column(nullable = false, unique = true)
    @Size(max = 20)
    private String username;

    @NotEmpty(message = "Password tidak boleh dikosongkan")
    @Size(max = 20)
    @Column(nullable = false)
    private String password;

    private boolean active = true;
}
