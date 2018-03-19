package client.party;

import connection.OutPacket;
import enums.PartyResultType;

/**
 * Created on 3/19/2018.
 */
public class PartyJoinResult implements PartyResultInfo {

    public Party party;
    public String joinerName;

    @Override
    public PartyResultType getType() {
        return PartyResultType.Join;
    }

    @Override
    public void encode(OutPacket outPacket) {
        outPacket.encodeInt(party.getId());
        outPacket.encodeString(joinerName);
        party.encode(outPacket);
    }
}
