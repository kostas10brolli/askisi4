public class Oven
{
    private int ipsos;
    private int platos;
    private int depth;
    private String kataskeuastis;

    private String onoma;

    private String tipos;

    private int energeia;


    private int xoritikotita;

    private boolean hasCleaningSystem;

    private boolean isCeramic;

    private boolean hasGrill;

    private static int timesCreated;

    public Oven()
    {
        timesCreated++;
        periodicMantainance();
    }

    public Oven(int ipsos,int platos,int depth,String kataskeuastis,String onoma,String tipos,int energeia,
                int xoritikotita,boolean isDigital,boolean hasCleaningSystem,boolean isCeramic,boolean hasGrill)
    {
        timesCreated++;

        setipsos(ipsos);

        setplatos(platos);

        setDepth(depth);

        setkataskeuastis(kataskeuastis);

        setonoma(onoma);

        settipos(tipos);

        setenergeia(energeia);

        setxoritikotita(xoritikotita);



        setCleaningSystem(hasCleaningSystem);

        setCeramic(isCeramic);

        setGrill(hasGrill);



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
        System.out.println("--Oven--");

        System.out.printf("ipsos: %d\n",this.ipsos);


        System.out.printf("platos: %d\n",this.platos);

        System.out.printf("Depth: %d\n",this.depth);

        System.out.printf("kataskeuastis: %s\n",this.kataskeuastis);

        System.out.printf("onoma: %s\n",this.onoma);

        System.out.printf("tipos: %s\n",this.tipos);

        System.out.printf("Power Supply: %d\n",this.energeia);



        System.out.printf("xoritikotita: %d\n",this.xoritikotita);



        System.out.printf("Has Cleaning System: %b\n",this.hasCleaningSystem);

        System.out.printf("Is Ceramic: %b\n",this.isCeramic);

        System.out.printf("Has Grill: %b\n",this.hasGrill);

        System.out.printf("Items Created: %d\n",timesCreated);
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
     * gets and sets platos
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
     * gets and sets depth
     */
    public int getDepth()
    {
        return this.depth;
    }
    public void setDepth(int depth)
    {
        this.depth = depth;
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
    /**
     * gets and sets xoritikotita
     */
    public int getxoritikotita() {
        return xoritikotita;
    }
    public void setxoritikotita(int xoritikotita) {
        this.xoritikotita = xoritikotita;
    }

    public boolean HasCleaningSystem() {
        return hasCleaningSystem;
    }
    public void setCleaningSystem(boolean hasCleaningSystem) {
        this.hasCleaningSystem = hasCleaningSystem;
    }
    /**
     * gets and sets the ceramic
     */
    public boolean isCeramic() {
        return isCeramic;
    }
    public void setCeramic(boolean ceramic) {
        isCeramic = ceramic;
    }
    /**
     * gets and sets grill
     */
    public boolean hasGrill() {
        return hasGrill;
    }
    public void setGrill(boolean hasGrill) {
        this.hasGrill = hasGrill;
    }
}
