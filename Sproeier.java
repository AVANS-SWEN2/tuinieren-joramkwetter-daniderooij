public class Sproeier {
    private String merk ;
    public boolean SproeierAan;
    public Sproeier() {
        super();
        merk = "Gardena";
    }
    public String getHoseBrand() {
        return merk;
    }

    public void sproeien ()
    {
        System.out.println("Aan het sproeien."); 
    }

    public void testMethod(){
        system.out.println("test");
    }

    public void staatieAan{
        system.out.println("staat ie aan?" + SproeierAan);

    }
}
