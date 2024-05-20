#!groovy
package DemoLib

class Dog{
    String name

    Dog(String name){
        this.name = name
    }

    def speak(){
        echo "${name} says bow!"
    }

}