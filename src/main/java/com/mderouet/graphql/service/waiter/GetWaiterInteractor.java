package com.mderouet.graphql.service.waiter;

import com.mderouet.graphql.model.waiter.Waiter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetWaiterInteractor {

    private final GetWaitersInteractor getWaitersInteractor;

    public Waiter execute(Integer id) {
        return getWaitersInteractor.execute().stream().filter(w -> w.id().equals(id)).findFirst().orElse(null);
    }
}
