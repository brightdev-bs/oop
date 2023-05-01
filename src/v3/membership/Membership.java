package v3.membership;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Membership {

    private static final ConcurrentHashMap<String, VIPMember> members = new ConcurrentHashMap<>();

    public static void joinMembership(String name) {
        members.put(name, new VIPMember(name));
    }

    public static Map<String, VIPMember> getMembers() {
        return members;
    }

}
