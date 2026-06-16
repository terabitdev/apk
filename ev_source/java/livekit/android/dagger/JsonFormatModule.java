package io.livekit.android.dagger;

import androidx.room.m0;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import vr.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/dagger/JsonFormatModule;", "", "<init>", "()V", "Lvr/c;", "kotlinSerializationJson", "()Lvr/c;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class JsonFormatModule {
    public static final JsonFormatModule INSTANCE = new JsonFormatModule();

    private JsonFormatModule() {
    }

    public final c kotlinSerializationJson() {
        return m0.b(JsonFormatModule$kotlinSerializationJson$1.INSTANCE);
    }
}
