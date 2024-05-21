
In cryptanalysis, (arguably) the hardest part of cracking public key ciphers is factoring the modulus. And often, once that's been accomplished one -may- find the totient or Euler's "phi" function yielding the exponent necessary to decrypt the ciphertext. Most RSA moduli are products of prime integers (i.e. their GCD is 1) and Euclid's Algorithm can help to confirm whether that's true.
