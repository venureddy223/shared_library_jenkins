#!groovy
package DemoLib

class kit {
    String name 

    kit(String name) {
        this.name = name
    }

    def speak(){
        return "${name} says meow!"
    }
}