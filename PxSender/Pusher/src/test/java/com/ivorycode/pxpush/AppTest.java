package com.ivorycode.pxpush;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;
import com.relayrides.pushy.apns.ApnsEnvironment;
import com.relayrides.pushy.apns.PushManager;
import com.relayrides.pushy.apns.util.SimpleApnsPushNotification;
import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, CommunicationException, KeystoreException {

        ApnsService service =
                APNS.newService()
                        .withCert("/Users/jbandi/Temp/PxPush/PxPush3.p12", "PxPush")
                        .withSandboxDestination()
                        .build();

        String payload = APNS.newPayload()
                .alertBody("Patient Schuster. Room 26!")
                .badge(1)
                .sound("siren.caf")
                .build();
        String token = "f362431a a9536c9a 75c715f2 cd751a44 e70bfa2a 903d58ab c71dff2b c6723749";
        service.push(token, payload);


        assertTrue( true );
    }
}
