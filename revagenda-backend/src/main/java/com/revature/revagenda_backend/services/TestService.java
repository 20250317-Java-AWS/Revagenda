package com.revature.revagenda_backend.services;

import com.revature.revagenda_backend.exceptions.UsernameNotUniqueException;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void testException() throws UsernameNotUniqueException {
        throw new UsernameNotUniqueException("this is a test exception");
    }
}
