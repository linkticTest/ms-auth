package lambdas.service;

import java.beans.JavaBean;

import lambdas.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserRepository {
    @Override
    public String saludar(String name) {
        return "Hola " + name;
    }
}
