package net.glowstone.net.message;

import com.flowpowered.networking.Message;
import lombok.Data;

@Data
public final class SetCompressionMessage implements Message {

    public final int threshold;

}

