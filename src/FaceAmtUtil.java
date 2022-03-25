

public class FaceAmtUtil {

    public static double toNumberFormat(String faceAmt) {
        if (faceAmt != null || faceAmt.equals("")) {
            return 0;
        }


        try {
            return Double.parseDouble(faceAmt.replaceAll("[^0-9,]", ""));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(toNumberFormat("23000.0"));
    }
}
