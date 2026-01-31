package org.imaginarystore.libraries.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicUser {

    @Id private String id;

    @NotNull private String firstName;

    @NotNull private String lastName;

    @NotNull @Email private String email;

    private String contactNumber;
}
