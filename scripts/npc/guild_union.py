# Lenario - Manager of Guild Union

GUILD_ALLIANCE_COST = 5000000
otherMember = None

def init():
    global otherMember
    otherMember = None
    if chr.getParty() is not None:
        for pm in chr.getParty().getOnlineMembers():
            other = pm.getChr()
            if other is not None and other is not chr and other.getGuild() is not None \
                    and other.getGuild().getAlliance() is None and other.getGuild().isGuildMaster(other):
                otherMember = other
    if chr.getGuild() is None or chr.getGuild().getAlliance() is not None or not chr.getGuild().isGuildMaster(chr) \
        or chr.getParty() is None or otherMember is None:
        sm.sendSayOkay("I'm in charge of guild alliances. If you wish to create an alliance, make a party with another "
                       "guild leader and talk to me again. It will cost you 5 million mesos.")
        sm.dispose()
    else:

        # for chr + other: guild exists, has no alliance, and have the party members as masters
        sm.sendAskYesNo("I see that you have another guild master in your party. Would you like to create an alliance "
                        "with them?")

def action(response, answer):
    if response == 1:
        if sm.getMesos() < GUILD_ALLIANCE_COST:
            sm.sendSayOkay("It seems that you're missing some mesos. Make sure you have at least 5 million mesos before "
                           "trying to create a guild alliance.")
            sm.dispose()
        else:
            sm.sendAskText("Please input your desired alliance name.", "", 4, 20)

def text_answer(text):
    global otherMember
    if sm.checkAllianceName(text):
        sm.createAlliance(text, otherMember)
        sm.sendSayOkay("Your alliance has successfully been created!")
        sm.dispose()
    else:
        sm.sendAskText("That alliance name is already in use.", "", 4, 20)
