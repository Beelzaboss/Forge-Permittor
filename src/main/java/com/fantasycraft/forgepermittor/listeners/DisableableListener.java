package com.fantasycraft.forgepermittor.listeners;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by thomas on 9/2/2014.
 */
public abstract class DisableableListener {
    @Getter
    @Setter
    private boolean enabled = true;
}
