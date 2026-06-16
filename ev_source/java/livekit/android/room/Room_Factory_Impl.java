package io.livekit.android.room;

import android.content.Context;
import io.livekit.android.room.Room;
import rn.a;
import ul.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final class Room_Factory_Impl implements Room.Factory {
    private final C0063Room_Factory delegateFactory;

    public Room_Factory_Impl(C0063Room_Factory c0063Room_Factory) {
        this.delegateFactory = c0063Room_Factory;
    }

    public static a create(C0063Room_Factory c0063Room_Factory) {
        return d.a(new Room_Factory_Impl(c0063Room_Factory));
    }

    @Override // io.livekit.android.room.Room.Factory
    public Room create(Context context) {
        return this.delegateFactory.get(context);
    }
}
