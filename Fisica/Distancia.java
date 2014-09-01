/*
**author Rafael
**
*/

public class Distancia{
		private double vel;  
    private double tempo;  
    private double total;  
  
    public double getVel() {  
        return vel;  
    }  
  
    public double getTempo() {  
        return tempo;  
    }  
  
    public void setVel(double vel) {  
        this.vel = vel;  
    }  
  
    public void setTempo(double tempo) {  
        this.tempo = tempo;  
    }  
  
    public double getTotal() {  
        return total;  
    }  
  
    public void calcular() {  
        this.total = this.vel * this.tempo;  
    }  
      
    public void imprimir(){       
        System.out.println("A distancia eh de: "+ this.getTotal() + " Km");          
          
    }
	}