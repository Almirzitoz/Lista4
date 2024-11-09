package questao1;
import java.util.ArrayList;
public class evento {
public ArrayList<String> ingressos = new ArrayList<>();
public ArrayList<String> ingressosvip = new ArrayList<>();

public void addIngresso(String n){
    ingressos.add(n);
}
public void addIngressoVip(String n){
    ingressosvip.add(n);
}

public void venderIngressos(String index){
    int i = Integer.parseInt(index);
    i = i-1;
    ingressos.set(i,"vendido");
    }
public void venderIngressosVip(String index){
    int i = Integer.parseInt(index);
    i = i-1;
    ingressosvip.set(i,"vendido");
    }


public int verificarVendidos(){
    int contador = 0;
    for(String n : ingressos){
        if (n.equals("vendido")) {
            contador++;
        }

    }
    return(contador);
}
public int verificarNaovendidos(){
        int contador = 0;
    for(String n : ingressos){
        if (n.equals("vendido")) {
        }
        else{
            contador++;
        }
    }
    return(contador);
}

public int verificarVendidosVip(){
    int contador = 0;
    for(String n : ingressosvip){
        if (n.equals("vendido")) {
            contador++;
        }
    }
    return(contador);
}
public int verificarNaovendidosVip(){
        int contador = 0;
    for(String n : ingressosvip){
        if (n.equals("vendido")) {
        }
        else{
            contador++;
        }
    }
    return(contador);
}
}
