import java.io.File;
public class App {
    public static void main(String[]args){
        File car = new File("nombre");
        boolean existe=FUtil.existe("");
        String name=car.getName();
        if(existe) {
            System.out.printf("El fichero /s existe", name);
        }
    }
}
