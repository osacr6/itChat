/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import com.ibm.cloud.sdk.core.http.HttpConfigOptions;
import com.ibm.cloud.sdk.core.security.IamAuthenticator;
import com.ibm.watson.assistant.v2.model.MessageInput;
import com.ibm.watson.assistant.v2.model.MessageOptions;
import com.ibm.watson.assistant.v2.model.MessageResponse;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.CreateSessionOptions;
import com.ibm.watson.assistant.v2.model.SessionResponse;

/**
 *
 * @author d.murillo.porras
 * from https://cloud.ibm.com/apidocs/assistant-v2?code=java
 */
public class watson {
    private IamAuthenticator authenticator;
    private Assistant assistant;
    private SessionResponse session;
    private String  ASSISTANT_URL = "https://api.us-east.assistant.watson.cloud.ibm.com";
    private String  ASSISTANT_ID = "da353dbf-56d3-4a6f-8750-2fc23c58050b";
    private String API_KEY = "CzoEs_XdrT0hl0IQfDJLfMFI-4tm3AjnpYCG3et46k9V";
    private String VERSION = "2021-07-01";
    private String session_id  = "ID-001";
    

    public watson() {
        // Using Assistant v1
        authenticator = new IamAuthenticator(API_KEY);
        assistant = new Assistant(VERSION, authenticator);
        assistant.setServiceUrl(ASSISTANT_URL);

        // Disable SSL verification
        HttpConfigOptions configOptions = new HttpConfigOptions.Builder()
            .disableSslVerification(true)
            .build();
        assistant.configureClient(configOptions);
        
        // Create a session
        CreateSessionOptions options = new CreateSessionOptions.Builder(ASSISTANT_ID).build();
        session = assistant.createSession(options).execute().getResult();
        System.out.println(session);
    }
    
    public MessageResponse getRespuesta(String mensaje) {
        MessageInput input = new MessageInput.Builder()
            .text(mensaje)
            .build();
        MessageOptions messageOptions = new MessageOptions.Builder()
            .assistantId(ASSISTANT_ID)
            .sessionId(session.getSessionId())
            .input(input)
            .build();
        MessageResponse messageResponse = assistant.message(messageOptions).execute().getResult();
        System.out.println(messageResponse);
        return messageResponse;
    }
}
