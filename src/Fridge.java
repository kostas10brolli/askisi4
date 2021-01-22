public class Fridge {

    private int ipsos;
    private int platos;
    private int vathos;
    private String kataskeuastis;
    private String onoma;
    private String tipos;
    private int energeia;

    private int thorivos;
    private int xoritikotita;
    private int rafia;
    private String xroma;
    private boolean hasNoFrost;
    private boolean hasIceExit;

    private static int timesCreated;


    public Fridge()
    {
        periodicMantainance();
        timesCreated++;
    }

    public Fridge(int ipsos,int platos,int vathos,String kataskeuastis,String onoma,String tipos,int energeia,
                  int thorivos,int xoritikotita,int rafia,String xroma,boolean hasNoFrost,boolean hasIceExit)
    {
        timesCreated++;

        setipsos(ipsos);

        setplatos(platos);

        setplatos(vathos);

        setkataskeuastis(kataskeuastis);

        setonoma(onoma);

        settipos(tipos);

        setenergeia(energeia);


        setthorivos(thorivos);

        setxoritikotita(xoritikotita);

        setrafia(rafia);

        setxroma(xroma);

        setNoFrost(hasNoFrost);


        setIceExit(hasIceExit);

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

    public void showAll()
    {
        System.out.println("--Fridge--");

        System.out.printf("ipsos: %d\n",this.ipsos);

        System.out.printf("platos: %d\n",this.platos);

        System.out.printf("platos: %d\n",this.vathos);

        System.out.printf("kataskeuastis: %s\n",this.kataskeuastis);

        System.out.printf("onoma: %s\n",this.onoma);

        System.out.printf("tipos: %s\n",this.tipos);

        System.out.printf("Power Supply: %d\n",this.energeia);



        System.out.printf("Noise Rate: %d\n",this.thorivos);

        System.out.printf("xoritikotita: %d\n",this.xoritikotita);

        System.out.printf("rafia: %d\n",this.rafia);

        System.out.printf("xroma: %s\n",this.xroma);

        System.out.printf("Has No Frost: %b\n",this.hasNoFrost);

        System.out.printf("Has Ice Exit: %b\n",this.hasIceExit);

        System.out.printf("Times Created: %d\n",timesCreated);

    }


    /**
     * gets and sets ipsos
     */
    public int getipsos() {
        return this.ipsos;
    }
    public void setipsos(int ipsos) {
        this.ipsos = ipsos;
    }

    /**
     * gets and sets platos
     */
    public int getplatos() {
        return this.platos;
    }
    public void setplatos(int platos) {
        this.platos = platos;
    }

    /**
     * gets and sets platos
     */
    public int getVathos() {
        return this.vathos;
    }
    public void setvathos(int vathos) {
        this.vathos = platos;
    }

    /**
     * gets and sets kataskeuastis
     */
    public String getkataskeuastis() {
        return this.kataskeuastis;
    }
    public void setkataskeuastis(String kataskeuastis) {
        this.kataskeuastis = kataskeuastis;
    }

    /**
     * gets and sets onoma
     */
    public String getonoma() {
        return this.onoma;
    }
    public void setonoma(String onoma) {
        this.onoma = onoma;
    }

    /**
     * gets and sets tipos
     */
    public String gettipos() {
        return this.tipos;
    }
    public void settipos(String tipos) {
        this.tipos = tipos;
    }


    public int getenergeia() {
        return this.energeia;
    }
    public void setenergeia(int energeia) {
        this.energeia = energeia;
    }


    //exclusive
    /**
     * gets and sets thorivos
     */
    public int getthorivos() {
        return thorivos;
    }
    public void setthorivos(int thorivos) {
        this.thorivos = thorivos;
    }
    /**
     * gets and sets xoritikotita
     */
    public int getxoritikotita() {
        return xoritikotita;
    }
    public void setxoritikotita(int xoritikotita) {
        this.xoritikotita = xoritikotita;
    }
    /**
     * gets and sets rafia
     */
    public int getrafia() {
        return rafia;
    }
    public void setrafia(int rafia) {
        this.rafia = rafia;
    }
    /**
     * gets and sets xroma
     */
    public String getxroma() {
        return xroma;
    }
    public void setxroma(String xroma) {
        this.xroma = xroma;
    }
    boolean HasNoFrost() {
        return hasNoFrost;
    }
    public void setNoFrost(boolean hasNoFrost) {
        this.hasNoFrost = hasNoFrost;
    }

    public boolean HasIceExit() {
        return hasIceExit;
    }
    public void setIceExit(boolean hasIceExit) {
        this.hasIceExit = hasIceExit;
    }
}