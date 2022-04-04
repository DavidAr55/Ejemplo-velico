package Deporte;

//Deporte |----------Sakate---------|
public class Deporte {
    private int id;
    private String nombre, edad, skate;
    
    public Deporte(int id, String nombre, String edad, String skate){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.skate = skate;
    }
    
    public Deporte(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEdad(){
        return edad;
    }
    
    public void setEdad(String edad){
        this.edad = edad;
    }
    
    public String getSkate(){
        return skate;
    }
    
    public void setSkate(String skate){
        this.skate = skate;
    }
}
