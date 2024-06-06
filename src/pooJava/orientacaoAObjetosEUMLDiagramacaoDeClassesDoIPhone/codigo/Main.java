package pooJava.orientacaoAObjetosEUMLDiagramacaoDeClassesDoIPhone.codigo;

import java.util.Scanner;
import pooJava.orientacaoAObjetosEUMLDiagramacaoDeClassesDoIPhone.codigo.celular.Iphone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.printf("Informe o modelo do Celular: ");
        String modelo = scanner.nextLine();

        System.out.print("Qual seu número de telefone: ");
        String number = scanner.nextLine();
        System.out.print("Ano de fabricação: ");
        int ano = scanner.nextInt();
        

        Iphone iphone = new Iphone(modelo,number, ano);

        iphone.information();

        */
        Iphone iphone = new Iphone("15 pro","(11)96855-8431", 2020);
        int opcao = -1;
        int menuAPP = -1;
        do{
            iphone.menu(opcao);
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1://LIGAÇÃO
                    System.out.printf("Qual número deseja ligar: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case 2:// ATENDER LIGAÇÃO
                    iphone.atender();
                    break;
                case 3: // ENCERRAR LIGAÇÃO
                    iphone.encerrarLigacao();
                    break;
                case 4: // CORREIO DE VOZ
                    iphone.iniciarCorreioVoz();
                    break;
                case 5: //SAFARI
                    do {
                        iphone.menuSafari(menuAPP);
                        System.out.print("Digite sua opção: ");
                        menuAPP = scanner.nextInt();
                        switch (menuAPP){
                            case 1: //ABRIR PÁGINA
                                System.out.printf("Qual site deseja acessar: ");
                                String url = scanner.nextLine();
                                iphone.navegadorViewPage(url);
                                break;
                            case 2: //NOVA PÁGINA
                                iphone.navegadorNewPage();
                                break;
                            case 3: //ATUALIZAR PÁGINA
                                iphone.navegadorRefreshPage();
                                break;
                            case 4: //I78 INRMAÇÕES DO DISPOSITIVO
                                break;
                            case 0: //SAIR
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (menuAPP != 0);
                case 6://APPLE MUSIC5

                    do{
                        System.out.print("Digite sua opção: ");
                        menuAPP = scanner.nextInt();
                        iphone.appleBoasVindas(menuAPP);
                        System.out.print("Digite sua opção: ");
                        menuAPP = scanner.nextInt();
                        switch (menuAPP){
                            case 1: //PLAY MUSICA
                                iphone.applePlayMusic();
                                break;
                            case 2: //selecionar música
                                iphone.appleStopMusic();
                                break;
                            case 3: //ATUALIZAR PÁGINA
                                System.out.printf("Qual musica quer ouvir: ");
                                String musica = scanner.nextLine();
                                iphone.appleSelectorMusic(musica);
                                break;
                            case 0: //SAIR
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (menuAPP != 0);
                    break;
                case 7: //INFORMAÇÕES DO DISPOSITIVO
                    iphone.information();
                    break;
                case 0:
                    System.out.println("Saindo do Ihpone...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
        



}
