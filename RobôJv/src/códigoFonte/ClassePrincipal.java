package códigoFonte;

import javax.swing.JOptionPane;
import telas.FormJogo;

public class ClassePrincipal{

    public void principal() {
        String Pergunta = JOptionPane.showInputDialog(null, "E aí?");
        do{
            if(Pergunta.contains("Oi")|Pergunta.contains("oi")|Pergunta.contains("Olá")|Pergunta.contains("Ola")|Pergunta.contains("olá")|Pergunta.contains("ola")|Pergunta.contains("E aí")|Pergunta.contains("E ai")){
                Pergunta = JOptionPane.showInputDialog(null, "oi");
            }else if (Pergunta.contains("sua idade")|Pergunta.contains("anos você")|Pergunta.contains("anos voce")|Pergunta.contains("anos vc")|Pergunta.contains("anos tu")){
                Pergunta = JOptionPane.showInputDialog(null, " eu tenho 31 anos");
            }else if (Pergunta.contains("seu nome")|Pergunta.contains("teu nome")){
                Pergunta = JOptionPane.showInputDialog(null,"Meu nome é Neymar");
            }else if (Pergunta.contains("seu nome completo")|Pergunta.contains("teu nome completo")){
                Pergunta = JOptionPane.showInputDialog(null,"Meu nome é Neymar da Silva Santos Júnior");
            }else if (Pergunta.contains("seu endereço")){
                Pergunta = JOptionPane.showInputDialog(null, "Quer saber demais em parça rsrsrsrs mas eu posso dizer que moro em paris");
            }else if(Pergunta.contains("sua cidade")){
                Pergunta = JOptionPane.showInputDialog(null, "Eu moro em paris na França");
            }else if(Pergunta.contains("estado civil")|Pergunta.contains("namorada")|Pergunta.contains("noiva")){
                Pergunta = JOptionPane.showInputDialog(null, "atualmente eu namoro com a Bruna Biancardi"); 
            }else if(Pergunta.contains("tem filhos")|Pergunta.contains("planeja ter filh")){
                Pergunta = JOptionPane.showInputDialog(null, "Atualmente não tenho filhos, mas minha namorada Bruna está gravida");
            }else if(Pergunta.contains("próxima copa")){
                Pergunta = JOptionPane.showInputDialog(null,"Não sei se irei participar mas tô torcendo pelo Brasil");
            }else if(Pergunta.contains("mais 2 centimetros pro lado")|Pergunta.contains("mais 2 cm pro lado")|Pergunta.contains("mais 2cm pro lado")|Pergunta.contains("momento mais dificil")|Pergunta.contains("pior lesão")|Pergunta.contains("momento mais difícil")){
                Pergunta = JOptionPane.showInputDialog(null, " foi quando eu me lesionei e se a pancada fosse mais 2 centimetros pro lado... infelizmente eu não poderia mais andar");
            }else if(Pergunta.contains("cai muito")|Pergunta.contains("lesiona muito")){
                Pergunta = JOptionPane.showInputDialog(null, " é porque os caras acabam quebrando quando não conseguem parar o melhor, e aí começam a me quebrar né!!");
            }else if(Pergunta.contains("você sabe que está em um aplicativo né?")|Pergunta.contains("voce sabe que está em um aplicativo né?")|Pergunta.contains("vc sabe que está em um aplicativo né?")|Pergunta.contains("vc sabe que esta em um aplicativo né?")|Pergunta.contains("voce sabe que esta em um aplicativo né?")|Pergunta.contains("tu sabe que está em um aplicativo né?")|Pergunta.contains("tu sabe que esta em um aplicativo né?")){
                Pergunta = JOptionPane.showInputDialog(null, "Eu estou em vários aplicativos, como youtube, instagram, tiktok, etc");
            }else if(Pergunta.contains("Não cara, eu quero dizer que você literalmente está em um app, estilo um jogo nesse exato momento")|Pergunta.contains("Nao cara, eu quero dizer que voce literalmente esta em um app, estilo um jogo nesse exato momento")|Pergunta.contains("Nao cara eu quero dizer que voce literalmente esta em um app, estilo um jogo nesse exato momento")|Pergunta.contains("Não cara, eu quero dizer que você literalmente esta em um app, estilo um jogo nesse exato momento")){
                Pergunta = JOptionPane.showInputDialog(null, "Nossa!!! eu sempre quis estar em um jogo como esse, obrigado pela oportunidade quem me colocou aqui");
            }else if(Pergunta.contains("kkk")|Pergunta.contains("kkkk")|Pergunta.contains("kkkkk")|Pergunta.contains("kkkkkk")|Pergunta.contains("KKK")|Pergunta.contains("KKKK")|Pergunta.contains("KKKKK")){
                Pergunta = JOptionPane.showInputDialog(null, "kkkkkk");
            }else if(Pergunta.contains("kkk")|Pergunta.contains("kkkk")|Pergunta.contains("kkkkk")|Pergunta.contains("kkkkkk")|Pergunta.contains("KKK")|Pergunta.contains("KKKK")|Pergunta.contains("KKKKK")){
                Pergunta = JOptionPane.showInputDialog(null, "kkkkkk");
            }else if(Pergunta.contains("kkk")|Pergunta.contains("kkkk")|Pergunta.contains("kkkkk")|Pergunta.contains("kkkkkk")|Pergunta.contains("KKK")|Pergunta.contains("KKKK")|Pergunta.contains("KKKKK")){
                Pergunta = JOptionPane.showInputDialog(null, "kkkkkk");
            }else{
                Pergunta = JOptionPane.showInputDialog(null,"Não entendi a pergunta cara, faz outra aí moral");
            }
        }while(!(Pergunta.equals("")));
    }
}

