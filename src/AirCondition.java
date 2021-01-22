public class AirCondition {


    private int ipsos,platos;
    private int vathos;
    private String kataskeuastis;
    private String onoma;
    private String tipos;
    private int energeia;

    private int psiksi;
    private int thermansi;
    private boolean Wifi, filtro, isInverter;

    private static int timesCreated;
    /**
     * default constructor that sets everything to default values
     must be public
     */
    public AirCondition()
    {
        periodicMantainance();
        timesCreated++;
    }
    /**
     * constructor that recommended to be used for object initialization,must be public
     * @param ipsos blepei ipsos
     * @param platos blepei platos
     *
     * @param vathos blepei vathos
     * @param kataskeuastis blepei kataskeuastis
     *
     * @param onoma blepei onoma
     *
     * @param tipos blepei tipos
     *
     * @param energeia blepei  energeia
     * @param thermansi blepei zesti
     * @param Wifi blepei gia  wifi
     *
     *
     *
     *
     * @param filtro blepei  filter

     * @param isInverter sees if its inverted

     */
    public AirCondition(int ipsos,int platos,int vathos,String kataskeuastis,String onoma,String tipos,int energeia,
                        int psiksi,int thermansi,boolean Wifi,boolean filtro,String coldRank,boolean isInverter)
    {
        timesCreated++;

        setipsos(ipsos);

        setplatos(platos);

        setvathos(vathos);

        setkataskeuastis(kataskeuastis);

        setonoma(onoma);

        settipos(tipos);

        setenergeia(energeia);

        setpsiksi(psiksi);

        setthermansi(thermansi);

        setWifi(Wifi);

        setAirFilter(filtro);


        setInverter(isInverter);
    }

    public void showAll()
    {
        System.out.println("--Air Conditioner--");

        System.out.printf("ipsos: %d\n",this.ipsos);

        System.out.printf("platos: %d\n",this.platos);

        System.out.printf("vathos: %d\n",this.vathos);


        System.out.printf("kataskeuastis: %s\n",this.kataskeuastis);

        System.out.printf("onoma: %s\n",this.onoma);

        System.out.printf("tipos: %s\n",this.tipos);

        System.out.printf("Power Supply: %d\n",this.energeia);


        System.out.printf("Cold Power: %d\n",this.psiksi);

        System.out.printf("Hot Power: %d\n",this.thermansi);

        System.out.printf("Has Wifi: %b\n",this.Wifi);

        System.out.printf("Has Air Filtering: %b\n",this.filtro);



        System.out.printf("Is Inverter: %b\n",this.isInverter);

        System.out.printf("Times Created: %d\n",timesCreated);


    }


    public static int getTimesCreated()
    {
        return timesCreated;
    }


    private void periodicMantainance()
    {

    }

    private void periodicMantainance(int overloaded)
    {

    }

    /**
     * gets and sets ipsos

     */
    public int getipsos()
    {
        return this.ipsos;
    }
    public void setipsos(int ipsos)
    {
        this.ipsos = ipsos;
    }

    /**
     gets and sets platos

     */
    public int getplatos()
    {
        return this.platos;
    }
    public void setplatos(int platos)
    {
        this.platos = platos;
    }

    /**
     * gets and sets vathos
     */
    public int getvathos()
    {
        return this.vathos;
    }
    public void setvathos(int vathos)
    {
        this.vathos = vathos;
    }

    /**
     * gets and sets kataskeuastis

     */
    public String getkataskeuastis()
    {
        return this.kataskeuastis;
    }
    public void setkataskeuastis(String kataskeuastis)
    {
        this.kataskeuastis=kataskeuastis;
    }

    /**
     * gets and sets onoma
     *  must be public
     */
    public String getonoma()
    {
        return this.onoma;
    }
    public void setonoma(String onoma)
    {
        this.onoma=onoma;
    }

    /**
     * gets and sets tipos

     */
    public String gettipos()
    {
        return this.tipos;
    }
    public void settipos(String tipos)
    {
        this.tipos=tipos;
    }

    /**
     * gets and sets energeia

     */
    public int getenergeia()
    {
        return this.energeia;
    }
    public void setenergeia(int energeia)
    {
        this.energeia = energeia;
    }




    //exclusive
    /**
     * gets and sets psiksi

     */
    public int getpsiksi() {
        return psiksi;
    }
    public void setpsiksi(int psiksi) {
        this.psiksi = psiksi;
    }

    /**
     * gets and sets thermansi

     */
    public int getthermansi() {
        return thermansi;
    }

    public void setthermansi(int thermansi) {
        this.thermansi = thermansi;
    }
    /**
     * gets and sets th wifi*/
    public boolean Wifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }
    /**
     * gets and sets filtro*/
    public boolean filtro() {
        return filtro;
    }

    public void setAirFilter(boolean filtro) {
        this.filtro = filtro;
    }


    /**
     * gets and sets inverter
     */
    public boolean isInverter() {
        return isInverter;
    }
    public void setInverter(boolean inverter) {
        isInverter = inverter;
    }
}
