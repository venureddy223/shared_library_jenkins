#!groovy
package DemoLib

import java.util.concurrent.ThreadLocalRandom

class randomNumberGenerator{
    def generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1,100)
    }
}