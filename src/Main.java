public class Main {
    public static int[] ordenarUsandoBurbujaDesc(int[] array, String[] nombres) {
        int i;
        int temp;
        String tempNombre;
        boolean bandera = true;
        while (bandera) {
            bandera = false;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    tempNombre = nombres[i];
                    array[i] = array[i + 1];
                    nombres[i] = nombres[i + 1];
                    array[i + 1] = temp;
                    nombres[i + 1] = tempNombre;
                    bandera = true;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo burbuja!");
        int[] numeros = new int[]{5,6,1,3,9,8, 0, 2, 4, 7};
        String[] nombrePais = new String[]{"Ar","Cl","Mx","Ue","Pt","In", "Br", "Uy", "Es", "18"};

        ordenarUsandoBurbujaDesc(numeros, nombrePais);
        for (int i = 0; i < nombrePais.length; i++) {
            System.out.println(nombrePais[i]);
        }

    }
}