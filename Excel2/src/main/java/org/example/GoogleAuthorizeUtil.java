package org.example;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.services.sheets.v4.SheetsScopes;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

public class GoogleAuthorizeUtil {
    public static Credential authorize() throws IOException, GeneralSecurityException {

        // build GoogleClientSecrets from JSON file

        List scopes = Arrays.asList(SheetsScopes.SPREADSHEETS);

        // build Credential object


        return credential;
    }
}

