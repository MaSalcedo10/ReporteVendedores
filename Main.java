public class Main {

    public static void main(String[] args) {

        GenerateInfoFiles archivoV = new GenerateInfoFiles(); // Crear objeto
        GenerateInfoFiles archivoP = new GenerateInfoFiles(); // Crear objeto

        archivoV.leerArchivo("D:\\POLITECNICO\\Ingenieria de software\\6 SEMESTRE\\CONCEPTOS FUNDAMENTALES DE PROGRAMACION\\EJERCICIOS\\ReporteVendedores\\Vendedores.csv");
        archivoP.leerArchivo("D:\\POLITECNICO\\Ingenieria de software\\6 SEMESTRE\\CONCEPTOS FUNDAMENTALES DE PROGRAMACION\\EJERCICIOS\\ReporteVendedores\\productos.csv");
    }
}
