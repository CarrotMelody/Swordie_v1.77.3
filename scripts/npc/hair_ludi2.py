# Mini (2041009) | Ludibrium Hair Salon (220000004)

options = []

al = chr.getAvatarData().getAvatarLook()
hairColour = al.getHair() % 10
baseHair = al.getHair() - hairColour

for colour in range(8):
    colourOption = baseHair + colour
    options.append(colourOption)

answer = sm.sendAskAvatar("Choose your new hair colour!", False, False, options)
if answer < len(options):
    sm.changeCharacterLook(options[answer])