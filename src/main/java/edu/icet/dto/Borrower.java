package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Borrower {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String address;
    private String address2;
    private String country;
    private String contactNumber;
}
