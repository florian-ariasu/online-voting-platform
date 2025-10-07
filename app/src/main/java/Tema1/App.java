package Tema1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.text.*;

public class App {
    private Scanner scanner;

    private final Map <String, List<String>> listaComenzi = new HashMap<>();
    private final ManagerGeneralAlegeri managerAlegeri = new ManagerGeneralAlegeri();

    String cheie = null;
    String valoare = null;

    String[] cuvinte;
    String idAlegeri;
    String numeAlegeri;
    String numeCircumscriptie;
    String regiune;
    String numePersoana;
    String cnpCandidat;
    String cnpVotant;
    String neindemanatic;
    int varstaPersoana;

    public App(InputStream input) {
        this.scanner = new Scanner(input);
    }

    public void run() {
        // Implementați aici cerințele din enunț
        // Pentru citirea datelor de la tastatura se folosește câmpul scanner.

        while (scanner.hasNextLine()) {
            String comanda = scanner.nextLine();
            if (comanda == null || comanda.isEmpty()) {
                continue;
            }
            switch (comanda) {
                case "0": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    numeAlegeri = cuvinte[1];
                    managerAlegeri.CreareAlegeri(idAlegeri, numeAlegeri);
                    break;
                }
                case "1": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.PornireAlegeri(idAlegeri);
                    break;
                }
                case "2": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 3);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    regiune = cuvinte[2];
                    managerAlegeri.AdaugaCircumscriptie(idAlegeri, numeCircumscriptie, regiune);
                    break;
                }
                case "3": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    managerAlegeri.EliminaCircumscriptie(idAlegeri, numeCircumscriptie);
                    break;
                }
                case "4": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 4);
                    idAlegeri = cuvinte[0];
                    cnpCandidat = cuvinte[1];
                    varstaPersoana = Integer.parseInt(cuvinte[2]);
                    numePersoana = cuvinte[3];
                    managerAlegeri.AdaugaCandidat(idAlegeri, cnpCandidat, varstaPersoana, numePersoana);
                    break;
                }
                case "5": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    cnpCandidat = cuvinte[1];
                    managerAlegeri.EliminaCandidat(idAlegeri, cnpCandidat);
                    break;
                }
                case "6": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 6);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    cnpVotant = cuvinte[2];
                    varstaPersoana = Integer.parseInt(cuvinte[3]);
                    neindemanatic = cuvinte[4];
                    numePersoana = cuvinte[5];
                    managerAlegeri.AdauagaVotant(idAlegeri, numeCircumscriptie, cnpVotant, varstaPersoana, neindemanatic, numePersoana);
                    break;
                }
                case "7": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.ListareCandidatiAlegeri(idAlegeri);
                    break;
                }
                case "8": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    managerAlegeri.ListareVotantiCircumscriptie(idAlegeri, numeCircumscriptie);
                    break;
                }
                case "9": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 4);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    cnpVotant = cuvinte[2];
                    cnpCandidat = cuvinte[3];
                    managerAlegeri.Votare(idAlegeri, numeCircumscriptie, cnpVotant, cnpCandidat);
                    break;
                }
                case "10": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.OprireAlegeri(idAlegeri);
                    break;
                }
                case "11": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    managerAlegeri.RaportVoturiPerCircumscriptie(idAlegeri, numeCircumscriptie);
                    break;
                }
                case "12": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.RaportVoturiNational(idAlegeri);
                    break;
                }
                case "13": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    cuvinte = value.split(" ", 2);
                    idAlegeri = cuvinte[0];
                    numeCircumscriptie = cuvinte[1];
                    managerAlegeri.AnalizaDetaliataPerCircumscriptie(idAlegeri, numeCircumscriptie);
                    break;
                }
                case "14": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.AnalizaDetaliataNational(idAlegeri);
                    break;
                }
                case "15": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.RaportFraude(idAlegeri);
                    break;
                }
                case "16": {
                    if (!scanner.hasNextLine()) return;
                    String value = scanner.nextLine();
                    idAlegeri = value;
                    managerAlegeri.StergeAlegeri(idAlegeri);
                    break;
                }
                case "17": {
                    managerAlegeri.ListareAlegeri();
                    break;
                }
                case "18":
                    return;
                default:
                    // ignore invalid lines
                    break;
            }
        }
    }

    public static void main(String[] args) {
        App app = new App(System.in);
        app.run();
    }
}
