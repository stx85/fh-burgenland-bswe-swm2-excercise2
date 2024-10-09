package io.muehlbachler.bswe;

import org.springframework.stereotype.Service;

/**
 * Controller for string operations
 */
@Service
public class StringService {

    /**
     * Change the given string to upper case
     * @param string        String for upper case
     * @return              returns the parameter string in upper case
     */
    public String toUpperCase(final String string) {
        return string.toUpperCase();
    }
}
