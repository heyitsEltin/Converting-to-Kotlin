package com.example.convertingtokotlin

data class User(var firstName: String?, var lastName: String? = null)

val user1 = User("Dan", "Rick")
val user2 = User("Dan", "Rick")
val structural = user1 == user2
val referential = user1 === user2

val jane = User("Jane")
val joe = User("Joe", "Doe")

val john = User(firstName = "John", lastName = "Doe")

data class UserWithFirstParamDefaultValue(var firstName: String? = null, var lastName: String?)
