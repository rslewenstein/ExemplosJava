/*
**author Rafael
**
*/

public class Velocidade{
	private double dist;  
    private double tempo;  
    private double total;  
  
    public double getDist() {  
        return dist;  
    }  
  
    public double getTempo() {  
        return tempo;  
    }  
  
    public void setDist(double dist) {  
        this.dist = dist;  
    }  
  
    public void setTempo(double tempo) {  
        this.tempo = tempo;  
    }  
  
    public double getTotal() {  
        return total;  
    }  
  
    public void calcular() {  
        this.total = this.dist / this.tempo;  
    }  
      
    public void imprimir(){       
        System.out.println("A velocidade eh de: "+ this.getTotal() + " Km/h");          
          
    }
	}