package EntregaFinal.src;

import EntregaFinal.src.UI.TextUI;

public class RacingManager {
    public static void main(String[]args){
        try{
            new TextUI().run();
        } catch (Exception e){
            System.out.println("Não foi possível arrancar: "+ e.getMessage());
        }
    }
}
