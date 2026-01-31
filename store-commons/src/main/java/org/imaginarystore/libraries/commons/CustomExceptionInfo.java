package org.imaginarystore.libraries.commons;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomExceptionInfo {
    private String exceptionMessage;
    private String errorCode;
}
