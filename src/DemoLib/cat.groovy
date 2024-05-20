#!groovy
package DemoLib

class Cat {
    String name 

    Cat(String name) {
        this.name = name
    }

    def speak(){
        return "${name} says meow!"
    }
}