import com.google.zxing.WriterException;
import util.OtpUtil;

import java.io.IOException;
import java.util.Scanner;

import static util.OtpUtil.getTOTPCode;

public class Otp2FaApplication {

    public static void main(String[] args) throws IOException, WriterException {
        String secretKey = "QDWSM3OYBPGTEVSPB5FKVDM3CSNCWHVK";
        String email = "test@gmail.com";
        String companyName = "HabeebCycle Company";
        String barCodeUrl = OtpUtil.getGoogleAuthenticatorBarCode(secretKey, email, companyName);
        //System.out.println(barCodeUrl);
        //OtpUtil.createQRCode(barCodeUrl, "QRCode.png", 400, 400);

        String secret = OtpUtil.generateSecretKey();
        String code = OtpUtil.getTOTPCode(secret);
        System.out.println("secret: " + secret);
        System.out.println("code: " + code);


        //OtpUtil.infinityGeneratingCodes(secretKey);

        /*Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        if (code.equals(getTOTPCode(secretKey))) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Invalid 2FA Code");
            System.out.println(getTOTPCode(secretKey));
            System.out.println(getTOTPCode(secretKey));
            System.out.println(getTOTPCode(secretKey));
        }*/
    }
}
