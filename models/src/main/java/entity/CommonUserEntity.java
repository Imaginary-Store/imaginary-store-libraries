package entity;

import classes.Address;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CommonUserEntity {
    private String id;
    private String userId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNo;
    private Address address;
}
