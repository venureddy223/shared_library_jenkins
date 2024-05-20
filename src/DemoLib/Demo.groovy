#!groovy
package DemoLib

class Demo{
    String name

    Demo(String name){
        this.name = name
    }

    def speak(){
        return "${name} says bow!"
    }

}