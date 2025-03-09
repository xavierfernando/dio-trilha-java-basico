public class SmartTv {
    boolean ligada = false; 
    int canal = 1; 
    int volume = 25; 


    public void aumentarVolume () {
        volume++; 

        System.out.println("Aumnetando o volume para: " + volume);

    }

    public void diminuirVolume () {
        volume--; 

        System.out.println("Diminuindo o volume para: " + volume);

    }

    public void aumentarCanal () {
        canal++; 

        System.out.println("Aumnetando o canal para: " + canal);

    }

    public void diminuirCanal () {
        canal--; 

        System.out.println("Diminuindo o canal para: " + canal);

    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal; 

        System.out.println("Modificado o canal para: " + canal);
    }

    
}
