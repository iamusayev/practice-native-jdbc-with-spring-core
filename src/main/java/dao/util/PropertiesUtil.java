package dao.util;

import java.util.Properties;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PropertiesUtil {

    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }


        return PROPERTIES.getProperty(key);
    }

    @SneakyThrows
    private static void loadProperties() {

            PROPERTIES.load(stream);
        }
    }
}
