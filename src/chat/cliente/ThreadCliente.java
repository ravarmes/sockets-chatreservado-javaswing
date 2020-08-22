package chat.cliente;

import chat.objeto.Mensagem;
import chat.objeto.Mensagem.Action;
import chat.servidor.ThreadServidor;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

public class ThreadCliente extends Thread {

    private Socket socket;
    private JTextArea jTextArea;
    private String remetente;
    private JList jList;
    boolean sair = false;

    public ThreadCliente(String r, Socket s, JTextArea textArea, JList list) {
        this.remetente = r;
        this.socket = s;
        this.jTextArea = textArea;
        this.jList = list;
    }

    @Override
    public void run() {
        try {
            while (!sair) {
                ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
                Mensagem mensagem = (Mensagem) entrada.readObject();
                Action action = mensagem.getAction();

                switch (action) {
                    case CONNECT:
                        conectar(mensagem);
                        break;
                    case DISCONNECT:
                        desconectar(mensagem);
                        break;
                    case SEND:
                        receberMensagem(mensagem);
                        break;
                    case SEND_ONE:
                        receberMensagem(mensagem);
                        break;
                    case USERS_ONLINE:
                        atualizarUsuarios(mensagem);
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ThreadServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conectar(Mensagem mensagem) {
        this.jTextArea.append(mensagem.getRemetente() + " >> " + mensagem.getTexto() + "\n");
        this.jTextArea.setCaretPosition(this.jTextArea.getDocument().getLength() - 1); //Deixar o foco do JTextArea na última linha
    }

    public void desconectar(Mensagem mensagem) throws IOException {
        this.jTextArea.append(mensagem.getRemetente() + " >> " + mensagem.getTexto() + "\n");
        this.jTextArea.setCaretPosition(this.jTextArea.getDocument().getLength() - 1); //Deixar o foco do JTextArea na última linha

        if (mensagem.getRemetente().equals(this.remetente)) {
            this.socket.close();
            this.sair = true;
        }
    }

    public void receberMensagem(Mensagem mensagem) throws IOException {
        this.jTextArea.append(mensagem.getRemetente() + " >> " + mensagem.getTexto() + "\n");
        this.jTextArea.setCaretPosition(this.jTextArea.getDocument().getLength() - 1); //Deixar o foco do JTextArea na última linha
    }

    public void atualizarUsuarios(Mensagem mensagem) {
        ArrayList<String> usuariosOnline = mensagem.getUsuariosOnline();
        
        DefaultListModel model = new DefaultListModel();
        this.jList.setModel(model);
        model.clear();
        
        for(String usuario: usuariosOnline){
            model.addElement(usuario);
        }
    }

}
