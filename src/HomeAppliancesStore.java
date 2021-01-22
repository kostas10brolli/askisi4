public class HomeAppliancesStore {
    private static String onoma;
    private static String dieuthinsi;
    private static int ergazomeni;

    public static void main(String[] args)
    {
        HomeAppliancesStore customer = new HomeAppliancesStore();

        customer.setonoma("kostas");

        customer.setdieuthinsi("Athens36");

        customer.setergazomeni(12);
        System.out.println(customer.getonoma() + " " + customer.getdieuthinsi()+ " " + customer.getergazomeni());



        AirCondition LG = new AirCondition(200,300,150,"LG","LG",
                "TSORNO25",25,12345,2345,
                true,true,"A++",true);

        LG.showAll();

        System.out.println();

        System.out.println();


        Fridge smart = new Fridge(300,200,150,"LG","smart",
                "ARNE354J",200,45,450,
                6,"black",true,true);

        smart.showAll();

        System.out.println();

        System.out.println();

        Oven tsorela = new Oven(160,180,150,"tsorela","tsorela",
                "K23SKE",365,300,false,
                true,true,true);

        tsorela.showAll();

        System.out.println();

        System.out.println();

        String[] temperatures = {"25","70"};

        WashineMachine tsabo = new WashineMachine (200,250,80,"tsabo",
                "ITSAI326","TSABINA354",200,true,
                200,140,temperatures,10,
                true);

        tsabo.showAll();




    }

    private void periodicMantainance()
    {
        //do something here

    }


    public void setonoma(String onoma)
    {
        this.onoma = onoma;
    }

    public  void setdieuthinsi(String dieuthinsi)
    {
        this.dieuthinsi=dieuthinsi;
    }

    public  void setergazomeni(int ergazomeni)
    {
        this.ergazomeni = ergazomeni;
    }

    public String getonoma()
    {
        return this.onoma;
    }

    public  String getdieuthinsi()
    {
        return this.dieuthinsi;
    }

    public int getergazomeni()
    {
        return this.ergazomeni;
    }
}
