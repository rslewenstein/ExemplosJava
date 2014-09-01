/*
**author Rafael
**
*/

public class Tempo{
	private double dist;  
    private double vel;  
    private double total;  
  
    public double getDist() {  
        return dist;  
    }  
  
    public double getVel() {  
        return vel;  
    }  
  
    public void setDist(double dist) {  
        this.dist = dist;  
    }  
  
    public void setVel(double vel) {  
        this.vel = vel;  
    }  
  
    public double getTotal() {  
        return total;  
    }  
  
    public void calcular() {  
        this.total = this.dist / this.vel;  
    }  
      
    public void imprimir(){       
        System.out.println("O tempo eh de: "+ this.getTotal() + " Hs");          
          
    }
	}