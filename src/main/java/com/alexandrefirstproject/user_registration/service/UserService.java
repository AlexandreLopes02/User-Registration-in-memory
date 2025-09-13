package com.alexandrefirstproject.user_registration.service;

import com.alexandrefirstproject.user_registration.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private final List<User> users = new ArrayList<>();
    private long nextId = 1;

    public User addUser(User user) throws IllegalAccessException {
        if (user.getName() == null || user.getName().isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            throw new IllegalArgumentException("Email obrigatório");
        }
        if (user.getPassword() == null || user.getPassword().length() < 6) {
            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres");
        }
        if (users.stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(user.getEmail()))) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        user.setId(nextId++);
        user.setCreatedAt(LocalDateTime.now());
        users.add(user);
        return user;
    }

//    Listar todos os usuários
    public List<User> getAllUsers() {
        return users;
    }

//     Buscar usuário pelo email
    public Optional<User> getUserByEmail(String email) {
        return users.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .findFirst();
    }

//     Remover usuário pelo email
    public boolean removeUserByEmail(String email) {
        return users.removeIf(u -> u.getEmail().equalsIgnoreCase(email));
    }
}
