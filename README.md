# TP 4A SQR 2019-20: enigma
Code for the German Enigma machine used in WW2.

## Questions
- Fork this github repository
- Run the project
- Comment the 2 classes
- Complete the next section : functions to be tested
- Commit your changes (commit README.md)
- Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
- Commit your changes
- On github, make a pull request 
- that ends

## Functions to be tested
Hereafter, for each classes give function to be tested 

### Classe Machine
#### Les fonctions initRotors(), SetPositions(), configure() qui sont des fonctions d'initialisations ne sont pas à tester
	On testera les méthodes convert(), convertChar() et advanceRotors(). A noté que la fonction convert() a déjà été testée dans la classe MachineTest

### Classe Reflector
#### On testera la fonction reflectorFactory() et convertForward()

### Classe Rotor
#### function
	Les constructeurs de la classe Rotor de sont pas à tester
	On testera la fonction rotorFactory(), convertForward(), convertBackward()
	
## Tricks & tips

- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Rotor, then test the rotor instance's state
> Rotor r=new Rotor();
> int actual = r.getosition();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

## Documentation and validation set
### How simulate Enigma machine:
- https://korben.info/enigma-le-simulateur.html
- https://observablehq.com/@tmcw/enigma-machine
### Configuration code :
- * B III IV I AXLE
- FROM his shoulder Hiawatha / HYIHL BKOML IUYDC MPPSF SZW
- Took the camera of rosewood / SQCNJ EXNUO JYRZE KTCNB DGU



 