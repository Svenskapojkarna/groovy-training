package com.alhytone

@groovy.transform.ToString()
class Employee implements Serializable{
    String first, last, email, fullName

    void setFullName(String name){
        fullName = name
    }

    String getFullName(){
        "Full name: ${fullName}"
    }
}
