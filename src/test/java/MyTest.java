

import org.junit.Test;

import java.util.Arrays;

public class MyTest {

    @Test
    public void myTest(){
        double a = 66/8.0;
        System.out.println(a);
        double b = Math.ceil(a);
        System.out.println(b);
        double c = b * 8;
        System.out.println(c);
        Double d = Double.valueOf(c);
        System.out.println(d);
        int e = d.intValue();
        System.out.println(e);
        //int messageLength = Double.valueOf(Math.ceil(message.length() / 8.0) * 8).intValue();
    }

    @Test
    public void myTest1(){
        byte[] workingkey = new byte[17];
        byte[] acKey = new byte[17];

        for (byte b : acKey) {
            b = 0x00;
        }

        for (byte b : workingkey) {
            b = 0x01;
        }
        System.out.println(Arrays.toString(workingkey));
        acKey = "483725".getBytes();
        int i = acKey.length;
        asc_to_bcd(workingkey, acKey, i, 0);

        System.out.println(Arrays.toString(workingkey));
    }

    private static void asc_to_bcd (byte[] bcd_buf ,byte[] ascii_buf ,int conv_len ,int type)
    {
        int cnt ;
        int cnt2 = 0;
        char ch,ch1 ;

        if ((conv_len & 0x01)==0 && type==0)
            ch1 = 0 ;
        else
            ch1 = 0x55 ;
        for ( cnt = 0 ; cnt < conv_len ; cnt++ ) {
            if ( ascii_buf[cnt] >= 'a' ){
                ch = (char) (ascii_buf[cnt] - 'a' + 10) ;
            }
            else if ( ascii_buf[cnt] >= 'A' ){
                ch = (char) (ascii_buf[cnt]- 'A' + 10) ;
            }
            else if ( ascii_buf[cnt] >= '0' ){
                ch = (char) (ascii_buf[cnt]-'0') ;
            }
            else{
                ch = 0;
            }
            if (ch1 == 0x55){
                ch1 = ch ;
            }else {
                bcd_buf[cnt2++] = (byte) ((ch1 << 4) | ch) ;
                ch1 = 0x55 ;
            }
        }
        if ( ch1 != 0x55 )
            bcd_buf[cnt2] = (byte) (ch1 << 4 | 0x0F) ;
        return;
    }
}
