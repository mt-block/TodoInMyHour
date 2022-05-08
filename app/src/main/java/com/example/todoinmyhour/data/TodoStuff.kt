package com.example.todoinmyhour.data

class TodoStuff {

    var dateTime: String? = null
    var taskNote: String? = null
    var taskStatus: Boolean? = null

    constructor(){}


    constructor(dateTime: String?, taskNote: String?, taskStatus: Boolean?) {
        this.dateTime = dateTime
        this.taskNote = taskNote
        this.taskStatus = taskStatus
    }

}