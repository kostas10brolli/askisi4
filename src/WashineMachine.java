public class WashineMachine
{
    private int ipsos;

    private int platos;

    private int vathos;

    private String kataskeuastis;

    private String onoma;

    private String tipos;

    private int energeia;



    private boolean hasPause;

    private int xoritikotita;

    private int strofes;

    private String[] thermokrasia;

    private int paroxinerou;

    private boolean asfaleia;

    private static int timesCreated;

    public WashineMachine()
    {
        timesCreated++;
        periodicMantainance();
    }

    public WashineMachine(int ipsos,int platos,int vathos,String kataskeuastis,String onoma,String tipos,int energeia,
                          boolean hasPause, int xoritikotita,int strofes,String[] thermokrasia,int paroxinerou,boolean asfaleia)
    {
        timesCreated++;

        setipsos(ipsos);

        setplatos(platos);

        setvathos(vathos);


        setkataskeuastis(kataskeuastis);

        setonoma(onoma);

        settipos(tipos);

        setenergeia(energeia);

        setPause(hasPause);

        setxoritikotita(xoritikotita);

        setstrofes(strofes);

        setthermokrasia(thermokrasia);

        setparoxinerou(paroxinerou);

        setLockForChildren(asfaleia);

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
        System.out.println("--Washine Machine--");


        System.out.printf("ipsos: %d\n",this.ipsos);

        System.out.printf("platos: %d\n",this.platos);

        System.out.printf("vathos: %d\n",this.vathos);

        System.out.printf("kataskeuastis: %s\n",this.kataskeuastis);

        System.out.printf("onoma: %s\n",this.onoma);

        System.out.printf("tipos: %s\n",this.tipos);

        System.out.printf("Power Supply: %d\n",this.energeia);


        System.out.printf("Has Pause: %b\n",this.hasPause);

        System.out.printf("xoritikotita: %d\n",this.xoritikotita);

        System.out.printf("Turns Per Second: %d\n",this.strofes);

        System.out.printf("thermokrasia: %s\n",this.thermokrasia);

        System.out.printf("Watter Supply: %s\n",this.paroxinerou);

        System.out.printf("Has Lock For Children: %s\n",this.asfaleia);

        System.out.printf("Times Created: %d\n",timesCreated);


    }


    public int getipsos()
    {
        return this.ipsos;
    }
    public void setipsos(int ipsos)
    {
        this.ipsos = ipsos;
    }


    public int getplatos()
    {
        return this.platos;
    }
    public void setplatos(int platos)
    {
        this.platos = platos;
    }


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


    public int getenergeia()
    {
        return this.energeia;
    }
    public void setenergeia(int energeia)
    {
        this.energeia = energeia;
    }



    //exclusive

    public boolean HasPause() {
        return hasPause;
    }
    public void setPause(boolean hasPause) {
        this.hasPause = hasPause;
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
     * gets and sets strofes
     */
    public int getstrofes() {
        return strofes;
    }
    public void setstrofes(int strofes) {
        this.strofes = strofes;
    }

    /**
     * gets and sets the thermokrasia
     */
    public String[] getthermokrasia() {
        return thermokrasia;
    }
    public void setthermokrasia(String[] thermokrasia) {
        this.thermokrasia = thermokrasia;
    }

    public int getparoxinerou() {
        return paroxinerou;
    }
    public void setparoxinerou(int paroxinerou) {
        this.paroxinerou = paroxinerou;
    }


    public boolean asfaleia() {
        return asfaleia;
    }
    public void setLockForChildren(boolean asfaleia) {
        this.asfaleia = asfaleia;
    }
}