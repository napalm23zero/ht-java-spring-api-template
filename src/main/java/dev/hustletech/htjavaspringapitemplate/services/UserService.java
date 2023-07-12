package dev.hustletech.htjavaspringapitemplate.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String get(String lang) {
        if (lang == "pt-br") {
            return "Usuário: Rodrigo";
        }
        if (lang == "en-us") {
            return "User: Rodrigo";
        }
        return "idioma não reconhecido";
    }

    public String create(String lang) {
        if (lang == "pt-br") {
            return "Usuário Criado";
        }
        if (lang == "en-us") {
            return "User Created";
        }
        return "idioma não reconhecido";
    }

    public String update(String lang) {
        if (lang == "pt-br") {
            return "Usuário Alterado";
        }
        if (lang == "en-us") {
            return "User Updated";
        }
        return "idioma não reconhecido";
    }

    public String delete(String lang) {
        if (lang == "pt-br") {
            return "Usuário Apagado";
        }
        if (lang == "en-us") {
            return "User Deleted";
        }
        return "idioma não reconhecido";
    }

}
