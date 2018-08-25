package org.amirh;
@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def somthing(i) {
    return Primes.isPrime(i)
}

