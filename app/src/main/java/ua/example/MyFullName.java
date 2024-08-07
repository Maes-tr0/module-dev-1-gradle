package ua.example;

import com.google.gson.Gson;

public record MyFullName(String firstName, String lastName) {

    public String getFullNameByGSON() {
        return new Gson().newBuilder().setPrettyPrinting().create().toJson(this);
    }
}
