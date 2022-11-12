package com.mderouet.graphql.controller.waiter;

import com.mderouet.graphql.model.waiter.Waiter;
import com.mderouet.graphql.service.waiter.GetWaiterInteractor;
import com.mderouet.graphql.service.waiter.GetWaitersInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class WaiterController {
    private final GetWaitersInteractor getWaitersInteractor;

    private final GetWaiterInteractor getWaiterInteractor;

    @QueryMapping
    public Waiter waiterById(@Argument Integer id) {
        return getWaiterInteractor.execute(id);
    }

    @QueryMapping
    public List<Waiter> waiters(){
        return getWaitersInteractor.execute();
    }
}

