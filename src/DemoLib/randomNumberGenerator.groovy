#!groovy
package DemoLib

import java.util.concurrent.ThreadLocalRandom

class randomNumberGenerator{
    def generateRandomNumber(min, max) {
        return ThreadLocalRandom.current().nextInt(min,max+1)
    }
}