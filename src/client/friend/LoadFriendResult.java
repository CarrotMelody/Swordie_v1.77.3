package client.friend;

import connection.OutPacket;
import enums.FriendType;

import java.util.Set;

/**
 * Created on 3/31/2018.
 */
public class LoadFriendResult implements FriendResult {

    private Set<Friend> friends;

    public LoadFriendResult(Set<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public FriendType getType() {
        return FriendType.FriendRes_LoadFriend_Done;
    }

    @Override
    public void encode(OutPacket outPacket) {
        outPacket.encodeInt(friends.size());
        for(Friend f : friends) {
            f.encode(outPacket);
        }
    }
}
