#!groovy
package DemoLib

class Demo {
    String name
    Demo(String name) {
        this.name = name
    }

    def somefuntion(){
        return "name is ${name}"
    }
    
}