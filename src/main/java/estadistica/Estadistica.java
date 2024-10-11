package estadistica;

public class Estadistica {
    private int numElementos;
    private double sumaX,sumaX2;

    ///***Agrega el dato `d` a la serie***
    /// @param d :valor
    public void agrega(double d){
        numElementos++;
        sumaX += d;
        sumaX2 += d*d;
    }

    /// ***Agrega del dato `d`, `n` veces a la serie***
    /// @param d :valor
    /// @param n :repeticiones
    public void agrega(double d, int n){
        numElementos += n;
        sumaX += d*n;
        sumaX2 += n*d*d;
    }

    /// ***Devuelve la media de la serie***
    /// @return media
    public double media(){
        return sumaX/numElementos;
    }

    /// ***Devuelve la varianza de la serie***
    /// @return varianza
    public double varianza(){
        return (sumaX2 / numElementos - Math.pow(media(),2));
    }

    /// ***Devuelve la desviacion tipica de la serie***
    /// @return desviacion tipica
    public double desviacionTipica(){
        return Math.sqrt(varianza());
    }
}
