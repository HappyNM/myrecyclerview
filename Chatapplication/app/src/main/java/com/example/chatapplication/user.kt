package com.example.chatapplication

class user {
    var name: String? = null
    var email: String? = null
    var Uid: String? = null

    constructor(){}

    constructor(name: String?, email: String, uid: String?){
        this.name = name
        this.email = email
        this.Uid = uid
    }
}