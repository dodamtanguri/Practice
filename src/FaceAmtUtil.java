import commons.customException.KpcFaceAmtException;
import commons.enums.ErrorCode;

public class FaceAmtUtil {

    public static double toNumberFormat(String faceAmt) throws KpcFaceAmtException {
        if (faceAmt != null || faceAmt.equals("")) {
            try {
                return Double.parseDouble(faceAmt.replaceAll("[^0-9.,]", ""));
            } catch (Exception e) {
                throw new KpcFaceAmtException(ErrorCode.NOT_FOUND_FACE_AMOUNT);
            }
        } else {
            throw new KpcFaceAmtException(ErrorCode.NOT_FOUND_FACE_AMOUNT);
        }
    }

    public static void main(String[] args) throws KpcFaceAmtException {
        System.out.println(toNumberFormat("     0"));
    }
}
