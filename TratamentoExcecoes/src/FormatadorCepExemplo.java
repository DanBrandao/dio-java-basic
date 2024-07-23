public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("23765065");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExcepction e) {
            System.out.println("O cep não corresponde com as regras de negócio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExcepction{
        if(cep.length() != 8)
            throw new CepInvalidoExcepction();

            return "23.765-064";
    }
}
