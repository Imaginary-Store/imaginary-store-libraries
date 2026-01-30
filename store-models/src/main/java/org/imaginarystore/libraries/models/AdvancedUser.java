package org.imaginarystore.libraries.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvancedUser extends BasicUser {
    private String type;
    private String adminId;
    private String status;
}
