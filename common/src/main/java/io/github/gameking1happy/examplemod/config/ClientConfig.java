package io.github.gameking1happy.examplemod.config;

import me.fzzyhmstrs.fzzy_config.annotations.Comment;
import me.fzzyhmstrs.fzzy_config.annotations.RequiresAction;
import me.fzzyhmstrs.fzzy_config.config.Config;
import me.fzzyhmstrs.fzzy_config.validation.misc.ValidatedBoolean;

import static io.github.gameking1happy.examplemod.Main.MOD_ID;
import static io.github.gameking1happy.gk1hcore.Main.fNAP;
import static me.fzzyhmstrs.fzzy_config.annotations.Action.RELOG;

@RequiresAction(action = RELOG)
public class ClientConfig extends Config {
    public ClientConfig() {
        super(fNAP(MOD_ID, "client_config"));
    }
    @Comment("Example Client Config Value.")
    public ValidatedBoolean ExampleClient = new ValidatedBoolean(true);
}