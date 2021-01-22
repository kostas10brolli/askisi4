public abstract class Device implements DeviceBasic
{
    public static double mikos;
    public static double ipsos;
    public static double vathos;
    public static String onomakataskeuasth;
    public static String onomasiskeuhs;
    public static String devicetype;
    public static String katanalosh;
    public static Boolean status;


    public double getmikos (){
        return mikos;
    }

    public double getipsos (){
        return ipsos;
    }

    public double getvathos (){
        return vathos;
    }

    public String getonomakataskeuasth (){
        return onomakataskeuasth;
    }

    public String getonomasiskeuhs (){
        return onomasiskeuhs;
    }

    public String getDevicetype (){
        return devicetype;
    }
    public String getkatanalosh (){
        return katanalosh;
    }

    public void setmikos (double mikos) {
        Device.mikos = mikos;
    }
    public void setipsos (double ipsos) {
        Device.ipsos = ipsos;
    }
    public void setvathos (double vathos) {
        Device.vathos = vathos;
    }
    public void setonomakataskeuasth (String onomakataskeuasth) {
        Device.onomakataskeuasth = onomakataskeuasth;
    }
    public void setonomasiskeuhs (String onomasiskeuhs) {
        Device.onomasiskeuhs = onomasiskeuhs;
    }
    public void setDevicetype (String devicetype) {
        Device.devicetype = devicetype;
    }
    public void setkatanalosh (String katanalosh) {
        Device.katanalosh = katanalosh;
    }

    public void powerOn(){
        status=true;
    }
    public void powerOff(){
        status=false;
    }
    public boolean status(){
        return status;
    }

}
