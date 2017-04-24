package soma.cnt.br.somaapp;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by Marlon Pinheiro on 27/10/2016.
 */

public class UsuarioDAO {
    private static final String URL = "http://192.168.25.10:8080/somAPP/services/UsuarioDAO?wsdl";
    private static final String NAMESPACE = "http://somAPP.cnt.br";

    private static final String INSERIR="inserirUsuario";
    private static final String EXCLUIR="excluirUsuario";
    private static final String ALTERAR="alterarUsuario";
    private static final String BUSCAR="buscarUsuario";



    public boolean inserirUsuario(Usuario usuario){
        SoapObject inserirUsuario = new SoapObject(NAMESPACE, INSERIR);

        SoapObject user = new SoapObject(NAMESPACE, "usuario");
        user.addProperty("id", usuario.getId());
        user.addProperty("nome", usuario.getNome());
        user.addProperty("senha", usuario.getSenha());
        inserirUsuario.addSoapObject(user);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(inserirUsuario);
        envelope.implicitTypes = true;
        HttpTransportSE http = new HttpTransportSE(URL);

        try {
            http.call("uri:" + INSERIR, envelope);
            SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();
            return Boolean.parseBoolean(resposta.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterarUsuario(Usuario usuario){
        return true;
    }

    public boolean excluirUsuario(Usuario usuario){
        return true;
    }

    public boolean excluirUsuario(int id){
        return true;
    }

    public Usuario buscarUsuario(int id){
        Usuario usuario = null;
        return usuario;
    }

}




