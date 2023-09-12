package ecoders.ecodersbackend.exception.code;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
public enum ExceptionCode {

    MEMBER_ALREADY_EXISTS(FORBIDDEN, "Member already exists"),
    MEMBER_NOT_FOUND(NOT_FOUND, "Member not found"),
    AUTHENTICATION_METHOD_NOT_ALLOWED(METHOD_NOT_ALLOWED, "Authentication method not allowed"),
    AUTHENTICATION_FAILED(UNAUTHORIZED, "JWT authentication failed"),
    EXPIRED_ACCESS_TOKEN(UNAUTHORIZED, "Expired access token"),
    EXPIRED_REFRESH_TOKEN(UNAUTHORIZED, "Expired refresh token"),
    POST_NOT_FOUND(NOT_FOUND, "Post not found");

    private final HttpStatus httpStatus;

    private final String message;

    ExceptionCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
