#!groovy
package DemoLib

import java.util.concurrent.ThreadLocalRandom

class randomNumberGenerator{
    def generateRandomNumber(5, 50) {
        return ThreadLocalRandom.current().nextInt(min,max+1)
    }
}