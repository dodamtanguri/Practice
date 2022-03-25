package commons.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum ErrorCode {
    NOT_FOUND_FACE_AMOUNT("NOTFOUND", "잔액을 찾을 수 없습니다.");

    private final String code;
    private final String message;


}
