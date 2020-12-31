package users;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.Locale;

public class LocaleHelper {

    protected static ClassLoader getClassLoader(Object defaultObject) {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        if (loader == null) {
            loader = defaultObject.getClass().getClassLoader();
        }

        return loader;
    }

    public static String getLocaleString(
            String bundle,
            String key,
            Object parameters[],
            Locale locale) {

        String message = null;

        ResourceBundle resourceBundle = ResourceBundle.getBundle(bundle, locale,
                getClassLoader(parameters));

        try {
            message = resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            message = "ERROR MESSAGE!";
        }

        if (parameters != null) {
            StringBuffer stringBuffer = new StringBuffer();
            MessageFormat messageFormat = new MessageFormat(message, locale);
            message = messageFormat.format(parameters, stringBuffer, null).toString();
        }

        return message;
    }
}
