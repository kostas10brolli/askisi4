public interface DeviceBasic
{

    double mikos = 0;
    double ipsos = 0;
    double vathos = 0;
    String onomakataskeuasth = null;
    String onomasiskeuhs = null;
    String tipos = null;
    String katanalosh = null;
    int count = 0;

    boolean status= Boolean.parseBoolean(null);


    static void powerOn(){}
    static void powerOff (){}
    //int periodicMantainance() {

    //}
    public static boolean status() {
        return status;
    }

    public static double getmikos (){
        return mikos;
    }
    public static double getipsos (){
        return ipsos;
    }
    public static double getvathos (){
        return vathos;
    }
    public static String getonomakataskeuasth (){
        return onomakataskeuasth;
    }
    public static String getonomasiskeuhs (){
        return onomasiskeuhs;
    }
    public static String gettipos (){
        return tipos;
    }
    public static String getkatanalosh (){
        return katanalosh;
    }

    public static int getFcount() {
        return count;
    }

    public static void print () {
        System.out.println("mikos:" + mikos + "\nipsos:" + ipsos + "\nvathos:" + vathos + "\nManufacturer Name:" + onomakataskeuasth + "\nDevice Name:" + onomasiskeuhs + "\nDevice Type:" + tipos +
                "\nEnergy Consumption:" + katanalosh);

//}
    }
}

