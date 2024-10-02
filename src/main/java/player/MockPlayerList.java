package player;

import lombok.Data;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Data
public class MockPlayerList {

    private int maxPlayers = 100;


    private Set<Player> onlinePlayers = Collections.synchronizedSet(new HashSet<>());
    private Set<Player> offlinePlayers = Collections.synchronizedSet(new HashSet<>());


    public Set<Player> getOnlinePlayers() {
        return Set.copyOf(onlinePlayers);
    }

    public Set<Player> getOfflinePlayers() {
        return Set.copyOf(offlinePlayers);
    }
}
