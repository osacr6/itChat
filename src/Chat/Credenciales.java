/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

/**
 *
 * @author d.murillo.porras
 */
public abstract class Credenciales {
    private String  ASSISTANT_URL = "https://api.us-east.assistant.watson.cloud.ibm.com";
    private String  ASSISTANT_ID = "da353dbf-56d3-4a6f-8750-2fc23c58050b";
    private String API_KEY = "CzoEs_XdrT0hl0IQfDJLfMFI-4tm3AjnpYCG3et46k9V";
    private String VERSION = "2021-07-01";

    public String getASSISTANT_URL() {
        return ASSISTANT_URL;
    }

    public String getASSISTANT_ID() {
        return ASSISTANT_ID;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public String getVERSION() {
        return VERSION;
    }
}
