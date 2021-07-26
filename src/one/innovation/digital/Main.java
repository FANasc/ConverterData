package one.innovation.digital;

/********************************************************************************
 *
 * Objetivo: Converter data e hora atual para o formato dd/MM/yyyy HH:mm:ss.SSS
 * Autor   : Fernando
 * Data    : 26/07/2021
 *
 ********************************************************************************/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Criar data e hora atual
        Date dataHoraAtual = new Date();
        // Formatar a data e hora com "dd/MM/yyyy HH:mm:ss.SSS"
        SimpleDateFormat formatoDaDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        // Converte a data e hora em string
        String dataFormatada = formatoDaDataHora.format(dataHoraAtual);
        // Exibir data e hora sem formatação
        System.out.println("Data e hora atual sem formatação....................: " + dataHoraAtual);
        // Exibir data e hora no formato dd/MM/yyyy HH:mm:ss.SSS
        System.out.println("Data e hora atual no formato dd/MM/yyyy HH:mm:ss.SSS: " + dataFormatada);
    }
}