# Junior Adventurer

medal = 1142108

def init():
    if sm.canHold(medal):
        sm.chat("You have earned a new medal.")
        sm.giveItem(medal)
        sm.startQuestNoCheck(parentID)
        sm.completeQuestNoRewards(parentID)
    sm.dispose()