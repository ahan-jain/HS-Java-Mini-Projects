cat = {"name":"Snuffles" , "age": 8, "weight": 7, "hungercheck": True }
dog = {"name":"Buddy" , "age": 5, "weight": 4, "hungercheck": False }
rat = {"name":"Stuart" , "age": 3, "weight": 1, "hungercheck": False}

def feed(animal):
  if(animal== "cat"):
    print("Feeding Snuffles....")
    print("Her weight increased by 0.5. New weight: "+ str(cat["weight"]+0.5))
    cat["hungercheck"] = False
    print("She isn't hungry anymore. Hunger check is: " + str(cat["hungercheck"]))
  elif(animal== "dog"):
    print("Feeding Buddy....")
    print("His weight increased by 0.5. New weight: "+ str(dog["weight"]+0.5))
    dog["hungercheck"] = False
    print("He isn't hungry anymore. Hunger check is: " + str(dog["hungercheck"]))
  elif(animal== "rat"):
    print("Feeding Stuart....")
    print("His weight increased by 0.5. New weight: "+ str(rat["weight"]+0.5))
    rat["hungercheck"] = False
    print("He isn't hungry anymore. Hunger check is: " + str(rat["hungercheck"]))

def sleep(animal):
  if(animal== "cat"):
    print("Putting Snuffles to bed....")
    print("Her weight decreased by 0.25. New weight: "+ str(cat["weight"]-0.25))
    cat["hungercheck"] = True
    print("She is hungry now. Hunger check is: " + str(cat["hungercheck"]))
  elif(animal== "dog"):
    print("Putting Buddy to bed....")
    print("His weight decreased by 0.25. New weight: "+ str(dog["weight"]-0.25))
    dog["hungercheck"] = True
    print("He is hungry now. Hunger check is: " + str(dog["hungercheck"]))
  elif(animal== "rat"):
    print("Putting Stuart to bed....")
    print("His weight decreased by 0.25. New weight: "+ str(rat["weight"]-0.25))
    rat["hungercheck"] = True
    print("He is hungry now. Hunger check is: " + str(rat["hungercheck"]))

def play(animal):
  if(animal== "cat"):
    print("Playing with Snuffles....")
    print("Her weight decreased by 0.5. New weight: "+ str(cat["weight"]-0.5))
    cat["hungercheck"] = True
    print("She is hungry now. Hunger check is: " + str(cat["hungercheck"]))
  elif(animal== "dog"):
    print("Playing with Buddy....")
    print("His weight decreased by 0.5. New weight: "+ str(dog["weight"]-0.5))
    dog["hungercheck"] = True
    print("He is hungry now. Hunger check is: " + str(dog["hungercheck"]))
  elif(animal== "rat"):
    print("Playing with Stuart....")
    print("His weight decreased by 0.5. New weight: "+ str(rat["weight"]-0.5))
    rat["hungercheck"] = True
    print("He is hungry now. Hunger check is: " + str(rat["hungercheck"]))





pet = input("Welcome to the pet program! Which pet would you like to choose? (cat/dog/rat)\n")
if(pet == "cat"):
  q = input("Alright! Would you like to play with Snuffles, make her sleep or feed her?(play/sleep/feed)\n")
  if(q == "feed"):
    feed("cat")
  elif(q == "sleep"):
    sleep("cat")
  elif(q == "play"):
    play("cat")
if(pet == "dog"):
  q = input("Alright! Would you like to play with Buddy, make him sleep or feed him?(play/sleep/feed)\n")
  if(q == "feed"):
    feed("dog")
  elif(q == "sleep"):
    sleep("dog")
  elif(q == "play"):
    play("dog")
if(pet == "rat"):
  q = input("Alright! Would you like to play with Stuart, make him sleep or feed him?(play/sleep/feed)\n")
  if(q == "feed"):
    feed("rat")
  elif(q == "sleep"):
    sleep("rat")
  elif(q == "play"):
    play("rat")




