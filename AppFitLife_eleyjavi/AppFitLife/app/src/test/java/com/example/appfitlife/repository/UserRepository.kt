package com.example.appfitlife.repository

import com.example.appfitlife.model.User

class UserRepository {
    fun getUser(): User {
        return User(1, "Javiera Marchesse y Elena Espinoza", "ami@appfitlife.com")
    }
}