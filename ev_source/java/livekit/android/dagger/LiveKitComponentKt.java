package io.livekit.android.dagger;

import android.content.Context;
import io.livekit.android.LiveKitOverrides;
import io.livekit.android.dagger.LiveKitComponent;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"create", "Lio/livekit/android/dagger/LiveKitComponent;", "Lio/livekit/android/dagger/LiveKitComponent$Factory;", "context", "Landroid/content/Context;", "overrides", "Lio/livekit/android/LiveKitOverrides;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class LiveKitComponentKt {
    public static final LiveKitComponent create(LiveKitComponent.Factory factory, Context context, LiveKitOverrides liveKitOverrides) {
        factory.getClass();
        context.getClass();
        liveKitOverrides.getClass();
        return factory.create(context, new OverridesModule(liveKitOverrides));
    }
}
