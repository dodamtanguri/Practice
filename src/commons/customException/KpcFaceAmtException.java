package commons.customException;

import commons.enums.ErrorCode;
import lombok.Getter;


import static commons.enums.ErrorCode.NOT_FOUND_FACE_AMOUNT;


@Getter
public class KpcFaceAmtException extends Exception{



    private String errorMessage;

    private ErrorCode errorCode;

    public KpcFaceAmtException(ErrorCode code) {

        this.errorCode = NOT_FOUND_FACE_AMOUNT;
        this.errorMessage = code.getMessage();
    }





}
