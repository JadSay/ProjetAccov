public class Avion {
	private int model;
    private int capacite;
    private String pilote;
    private int posX;
    private int posY;
    private int posZ;
    private int vitX;
    private int vitY;
    private int vitZ;
    private int altitude;

    public int getModel()
    {
        return model;
    }
    
    public int capacite()
    {
        return capacite;
    }
    
    public void assignerPilote(String name) {
        pilote = name;
    }

}