package moornmo.policy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import moornmo.aggregate.*;
import moornmo.command.*;
import moornmo.event.*;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.DisallowReplay;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ProcessingGroup("basic")
public class PolicyHandler {

    @Autowired
    CommandGateway commandGateway;
}