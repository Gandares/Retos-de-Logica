print("Calcularlo con:")
print("1. Valores de PS exactos")
print("2. Porcentaje de vida restante")
metodo = input("Escoja un método (número): ")

if int(metodo) == 1:

    PSMax = input("PS Máximos del Pokémon: ")
    PSActuales = input("PS Actuales del Pokémon: ")

    while int(PSMax) < int(PSActuales):

        print("Los PS máximos no pueden ser menor que los actuales, rellene esos dos valores de nuevo.")

        PSMax = input("PS Máximos del Pokémon: ")
        PSActuales = input("PS Actuales del Pokémon: ")

if int(metodo) == 2:

    PSActuales = input("Porcentaje de vida restante: ")
    PSMax = 100.0

    while float(PSActuales) > 100.0:

        print("El porcentaje no puede superar el 100%.")

        PSActuales = input("Porcentaje de vida restante: ")

if int(metodo) != 1 and int(metodo) != 2:

    print("Error en la seleccion del método. SALIENDO...")
    exit()


Rc = input("Ratio captura del Pokémon: ")
Rb = input("Ratio de captura de la pokeball: ")
print("Problema de estado del pokemon")
print("1. Congelado")
print("2. Dormido")
print("3. Paralizado")
print("4. Envenenado")
print("5. Quemado")
print("6. Sin Estado")
Eleccion = input("Ingrese el número del estado en el que se encuentre: ")

while int(Eleccion) > 6 and int(Eleccion) < 1:

    print("Error en la selección de problemas de estado, intentelo de nuevo.")

    print("Problema de estado del pokemon")
    print("1. Congelado")
    print("2. Dormido")
    print("3. Paralizado")
    print("4. Envenenado")
    print("5. Quemado")
    print("6. Sin Estado")
    Eleccion = input("Ingrese el número del estado en el que se encuentre: ")

if int(Eleccion) == 1 or int(Eleccion) == 2:

    Pe = 2

else: 
    if int(Eleccion) >= 3 and int(Eleccion) <= 5:

        Pe = 1.5
    
    else:

        Pe = 1

VariableA = ((3 * int(PSMax) - 2 * int(PSActuales)) * int(Rc) * int(Rb) * Pe)/(3 * int(PSMax))

if VariableA >= 255:

    print("\na =", VariableA, end="\n")
    print("Ratio de captura: 100%")

else:

    print("\n\n a = ", VariableA, end="\n")
    print("Ratio de captura: ", round(VariableA/2.55, 2), "%")