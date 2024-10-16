public class UtilValidar {
    //Enzo Guedes Pelizaro
    private static int[] numValidar;
    private static int finalNum = 0;

    private static void formatar(String txt){
        numValidar = new int[txt.length()];

        StringBuilder sb = new StringBuilder();
        for(char c : txt.toCharArray()) {
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        for (int i = 0; i < sb.toString().length(); i++) {
            numValidar[i] = Character.getNumericValue(sb.toString().charAt(i));
        }

    }

    public static String validarCnpj(String txt){
        formatar(txt);

        //Validando primeiro digito verificador
        int[] pesos = {5,4,3,2,9,8,7,6,5,4,3,2};

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        int rest = finalNum %11;

        if (rest < 2) {
            if (numValidar[12] != 0){
                return "Cnpj inválido";
            }
        } else {
            if (numValidar[12] != 11 -rest){
                return "Cnpj inválido";
            }
        }

        //Validando segundo digito verificador;
        pesos = new int[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        finalNum = 0;

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        rest = finalNum %11;

        if (rest < 2) {
            if (numValidar[13] != 0){
                return "Cnpj inválido";
            }
        } else {
            if (numValidar[13] != 11 -rest){
                return "Cnpj inválido";
            }
        }

        return "Cnpj válido";
    }

    public static String validarCpf(String txt){
        formatar(txt);

        //Validando primeiro digito verificador
        int[] pesos = {10,9,8,7,6,5,4,3,2};

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        int rest = finalNum %11;

        if (rest < 2) {
            if (!(numValidar[9] == 0)){
                return "Cpf inválido";
            }
        } else if (!(numValidar[9] == 11 -rest)){
            return "Cpf inválido";
        }

        //Validando segundo digito verificador;
        pesos = new int[]{11,10,9,8,7,6,5,4,3,2};
        finalNum = 0;

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        rest = finalNum %11;

        if (rest < 2) {
            if (!(numValidar[10] == 0)){
                return "Cpf inválido";
            }
        } else if (!(numValidar[10] == 11 -rest)){
            return "Cpf inválido";
        }

        return "Cpf válido";
    }

    public static String validarRg(String txt){
        formatar(txt);

        int[] pesos = {2,3,4,5,6,7,8,9};

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        if (((finalNum + (100*numValidar[8])))%11  == 0){
            return "RG válido.";
        }else{
            return "RG inválido.";
        }
    }

    public static String validarIe(String txt){
        formatar(txt);

        int[] pesos = {9,8,7,6,5,4,3,2};

        for (int i = 0; i < pesos.length; i++) {
            finalNum += numValidar[i] * pesos[i];
        }

        int rest = finalNum %11;

        if (rest == 0 || rest == 1) {
            if (!(numValidar[8] == 0)){
                return "IE inválida";
            }
        } else if (!(numValidar[8] == 11 -rest)){
            return "IE inválida";
        }

        return "IE válida";
    }
}
