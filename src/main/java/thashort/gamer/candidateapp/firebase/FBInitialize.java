package thashort.gamer.candidateapp.firebase;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;

@Service
public class FBInitialize {

    @PostConstruct
    public void initialize() {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream serviceAccount = classloader.getResourceAsStream("privacy_key.json");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
