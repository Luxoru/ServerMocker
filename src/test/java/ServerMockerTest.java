import org.bukkit.entity.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import server.ServerMock;

import java.util.Collection;

public class ServerMockerTest {

    private static ServerMock server;
    @BeforeAll
    public static void before(){
        server = ServerMocker.mock();
    }



    @Test
    public void addPlayer(){



    }


}
