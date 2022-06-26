package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     public Properties properties = new Properties();
    String dosyaYolu = "configuration.properties";
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ConfigReader()  {
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public   String getProperty(String key) {
        /*
          test method'undan yolladigimiz string key degerini alip
          Properties class'indan getProperty( ) method'unu kullanarak
          bu key'e ait value'u bize getirdi
         */

        return properties.getProperty(key);
    }
}
