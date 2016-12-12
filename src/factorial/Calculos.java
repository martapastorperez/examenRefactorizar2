
package factorial;


public class Calculos {
    int j=8,f=1,i;
    
public void condicion(){

//Elimino la condicion ya que no es necesaria para que funcione correctamente el programa
for (i = j; i >= 1; i--)
{
    f = f * i;
}
System.out.println(f); 
    
    }
}
