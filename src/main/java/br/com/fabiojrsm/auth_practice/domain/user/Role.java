package br.com.fabiojrsm.auth_practice.domain.user;

public enum Role {

    ADMIN("admin"),

    USER("user");

    private String role;

    Role(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
