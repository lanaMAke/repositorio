
public class Persona{
 

    String nome;
    int classe;
    int nivel = 1;
    int vida = 100;
    int mana;
    int forca = 100;

   
    public int tipoPersona(){
       
      for(int i=0; i > 4; i++){
      swith(classe){
       
        case 1:
            System.out.println("Guerreiro!!><♠><")
            System.ou.println(" é um colosso de músculos e honra. Forjado em batalhas desde a juventude, carrega uma armadura de escamas negras e uma espada tão pesada quanto seu senso de justiça.\n Ele luta na linha de frente, protegendo seus aliados com coragem inabalável.\n
Personalidade: Leal, impulsivo e com um senso de dever quase exagerado.");
         break;
        case 2:
            System.out.println("•*•*♣ Mago •*•*♣");
            System.out.println("é uma elfa arcana, mestre das artes místicas. Seus olhos brilham como constelações, e sua presença impõe respeito. Veste um manto azul profundo coberto por runas cintilantes.\n Prefere resolver conflitos com sabedoria, mas não hesita em conjurar feitiços devastadores quando necessário.
Personalidade: Inteligente, enigmática e estrategista.");
         break;
        case 3:
            System.out.println("•* Arqueiro 🏹 •*")
            System.out.println("é ágil como o vento e mortal como uma flecha certeira. Usa roupas leves em tons verdes e marrons para se camuflar entre as árvores.\n É um rastreador exímio, capaz de derrubar um inimigo antes mesmo de ser visto.\n
Personalidade: Silencioso, observador e sarcástico.");
         break;
        default:
            System.out.println("\nEscolha inválida!");
      }

      }
    }

    public void ataque(){
         
      System.out.println(nome);

       if(tipoPersona() == 1){
        System.ou.println("!Guerreiro "+nome+"gerou Golpe Sísmico! ");
       } else if(tipoPersona()==2){
        System.out.println("Mago "+nome+"Atacou com Chuva Estelar!!*•*•*♦")
       } else if(tipoPersona() == 3){
        System.out.println("Arqueiro "+nome+"ativado!! gerou Tiro Silencioso");
       }
       }   

    public void receberDano(){
      if(int ataque = ataque();)
       vida -= ataque;
       forca-=2;
       //colocar para diminuir força
    }

    public void usarHabilidadeEspecial(){
        
       System.out.println("A")
       // libera ataque - gera dano ao personagem.
    }
    
    public void mostrarStatus(){

        System.out.println("\tStatus personagem "+nome+".: ");
        System.out.println("Nível \n"+nivel+"\nVidas <♥>\n"+vida+"♥-♥-♥-♥-♥ \nForça "+forca);
        //imprime situação do personagem
    }
    public void subirNivel(){
        if(vida >= 30){
            nivel++;
            System.out.println("Parabéns!! você concluiu nivel até a próxima História!! ");
            System.out.println("Nivel_"+nivel" Desbloqueado!");
        }
    }

    void desenhoPersona(){

    }
}
